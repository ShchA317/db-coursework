create table thing(
    id serial primary key,
    name varchar(64),
    type varchar(64),
    picture_id integer,
    flammability boolean,
    putability boolean -- возможность поставить
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
)

create table biom(
    id serial primary key,
    name varchar(64),
    type boolean --  земной/нет
);

create table biom_contains_block(
    biom_id integer references biom(id),
    block_id integer references block(id),
    primary key (biom_id, block_id)
);

create table thing_property(
    id serial primary key,
    name varchar(64),
    type varchar(64),
    value varchar(64) -- не очень поняла, что значит 'значение', поэтому записала его как varchar, может это ошибочно
);

create table mob(
    id serial primary key,
    name varchar(64)
)
