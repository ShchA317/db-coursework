CREATE TABLE biom (
  id integer NOT NULL,
  type varchar(20) NOT NULL,
  name integer NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE block (
  id serial NOT NULL,
  name varchar(20) DEFAULT NULL,
  type varchar(20) DEFAULT NULL,
  picture_id integer DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE can_enchantment (
  enchantment_id integer NOT NULL,
  thing_id integer NOT NULL,
  PRIMARY KEY (enchantment_id, thing_id)
);

CREATE TABLE thing_forging (
  thing_id integer NOT NULL,
  forging_id integer NOT NULL,
  PRIMARY KEY (thing_id, forging_id)
);

CREATE TABLE block_biom (
  block_id integer NOT NULL,
  biom_id integer NOT NULL,
  PRIMARY KEY (block_id, biom_id),
  CONSTRAINT block_biom_block_id_block_id_foreign FOREIGN KEY (block_id) REFERENCES block (id),
  CONSTRAINT block_biom_biom_id_biom_id_foreign FOREIGN KEY (biom_id) REFERENCES biom (id)
);

CREATE TABLE enchantment (
  id integer NOT NULL,
  name integer NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT enchantment_id_can_enchantment_enchantment_id_foreign FOREIGN KEY (id) REFERENCES can_enchantment (enchantment_id)
);

CREATE TABLE forging_recipe (
  id integer NOT NULL,
  input integer NOT NULL,
  output integer NOT NULL,
  experience integer NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT forging_recipe_id_thing_forging_forging_id_foreign FOREIGN KEY (id) REFERENCES thing_forging (forging_id)
);

CREATE TABLE break (
  block_id integer NOT NULL,
  thing_id integer NOT NULL,
  PRIMARY KEY (block_id, thing_id),
  CONSTRAINT break_block_id_block_id_foreign FOREIGN KEY (block_id) REFERENCES block (id),
  CONSTRAINT break_thing_id_thing_id_foreign FOREIGN KEY (thing_id) REFERENCES thing (id)
);

CREATE TABLE thing (
  id integer NOT NULL,
  name varchar(20) DEFAULT NULL,
  picture_id integer DEFAULT NULL,
  type varchar(20) DEFAULT NULL,
  flammability boolean DEFAULT NULL,
  is_block boolean DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT thing_id_baking_recipe_in_foreign FOREIGN KEY (id) REFERENCES baking_recipe ("in"),
  CONSTRAINT thing_id_enchantment_recipe_in_id_foreign FOREIGN KEY (id) REFERENCES enchantment_recipe (in_id),
  CONSTRAINT thing_id_craft_reciepe_result_foreign FOREIGN KEY (id) REFERENCES craft_reciepe (result),
  CONSTRAINT thing_id_can_enchantment_thing_id_foreign FOREIGN KEY (id) REFERENCES can_enchantment (thing_id),
  CONSTRAINT thing_id_thing_forging_thing_id_foreign FOREIGN KEY (id) REFERENCES thing_forging (thing_id)
);

CREATE TABLE drop (
    block_id integer NOT NULL,
    thing_id integer NOT NULL,
    PRIMARY KEY (block_id, thing_id),
    CONSTRAINT drop_thing_id_thing_id_foreign FOREIGN KEY (thing_id) REFERENCES thing (id),
    CONSTRAINT drop_block_id_block_id_foreign FOREIGN KEY (block_id) REFERENCES block (id)
  );

CREATE TABLE craft_reciepe (
  a1 integer NOT NULL,
  a2 integer NOT NULL,
  a3 integer NOT NULL,
  a4 integer NOT NULL,
  a5 integer NOT NULL,
  a6 integer NOT NULL,
  a7 integer NOT NULL,
  a8 integer DEFAULT NULL,
  a9 integer NOT NULL,
  result integer NOT NULL,
  PRIMARY KEY (result)
);

CREATE TABLE baking_recipe (
  "in" integer NOT NULL,
  out integer NOT NULL,
  PRIMARY KEY (out),
  CONSTRAINT baking_recipe_out_thing_id_foreign FOREIGN KEY (out) REFERENCES thing (id)
);

CREATE TABLE enchantment_recipe (
  id integer NOT NULL,
  experience integer NOT NULL,
  bookshelfs integer NOT NULL,
  level integer NOT NULL,
  in_id integer NOT NULL,
  out_id integer NOT NULL,
  enchantment_id integer NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT enchantment_recipe_enchantment_id_enchantment_id_foreign FOREIGN KEY (enchantment_id) REFERENCES enchantment (id),
  CONSTRAINT enchantment_recipe_out_id_thing_id_foreign FOREIGN KEY (out_id) REFERENCES thing (id)
);
