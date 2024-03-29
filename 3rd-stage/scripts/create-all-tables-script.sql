create type thing_type as enum('block', 'item');

create table thing(
    id serial primary key,
    name varchar(64) unique not null,
    type thing_type not null,
    game_id varchar(5) unique not null
);

create table block(
    id serial primary key,
    name varchar(64),
    picture_id integer,
    type varchar(64)
);

create table thing_breaks_block(
    thing_id integer references thing,
    block_id integer references block,
    primary key(thing_id, block_id)
);

create table thing_falls_from_bloc(
    thing_id integer references thing,
    block_id integer references block,
    primary key(thing_id, block_id)
);

create table biome(
    id serial primary key,
    name varchar(64),
    type boolean --  земной/нет
);

create table biome_block(
    biome_id integer references biome(id),
    block_id integer references block(id),
    primary key (biome_id, block_id)
);

create type thing_type_lvl2 as enum ('Строительный блок', 'Колба', 'Слиток', 'Инструмент',
    'Оружие', 'Книга', 'Жидкость', 'Еда');

create table thing_property(
    id serial primary key,
    thing_id integer references thing,
    type thing_type_lvl2,
    value varchar(64),
    flammability boolean not null
);

create table mob(
    id serial primary key,
    name varchar(64)
);

-- таблица, содержащая информацию о том, какую вещь можно получить у моба, не убивая его
-- например: корову можно подоить с помощью ведра и получить от неё молоко
create table mob_gives_thing(
	mob_id integer references mob,
	thing_id integer references thing,
	primary key (mob_id, thing_id),
	tool_id integer references thing
);

create table mob_drops_thing(
	mob_id integer references mob,
	thing_id integer references thing,
	primary key (mob_id, thing_id)
);


-- a1 a2 a3  \
-- a4 a5 a6    -->  result
-- a7 a8 a9  /
create table craft_recipe (
  id serial primary key,
  a1 integer references thing,
  a2 integer references thing,
  a3 integer references thing,
  a4 integer references thing,
  a5 integer references thing,
  a6 integer references thing,
  a7 integer references thing,
  a8 integer references thing,
  a9 integer references thing,
  result integer NOT NULL references thing
);

create table baking_recipe (
  "in" integer references thing,
  out integer references thing,
  PRIMARY KEY (out)
);

create table enchantment(
  id serial primary key,
  name varchar(10)
);

create table enchantment_recipe(
  id serial primary key,
  experience integer,
  bookshelfs integer,
  level integer,
  in_id integer references thing,
  out_id integer references thing,
  enchantment_id integer references enchantment
);

create table forging_recipe(
  id serial primary key,
  input integer references thing,
  source integer references thing,
  output integer references thing,
  experience integer
);

create table brewing_recipe(
    id serial primary key,
    input integer references thing,
    source integer references thing, -- пузырек с жидкостью
    result integer references thing -- зелье или пузырек с жидкостью
);

create index on thing using hash(name);

create function getMaterials(res int) returns setof int as
    '(select id from thing where id in ((select a1 from craft_recipe where result=res)
                            union (select a2 from craft_recipe where result=res)
                            union (select a3 from craft_recipe where result=res)
                            union (select a4 from craft_recipe where result=res)
                            union (select a5 from craft_recipe where result=res)
                            union (select a6 from craft_recipe where result=res)
                            union (select a7 from craft_recipe where result=res)
                            union (select a8 from craft_recipe where result=res)))'
language sql;