truncate table thing cascade;
truncate table block cascade;
truncate table thing_breaks_block;
truncate table thing_falls_from_bloc;
truncate table biome cascade;
truncate table biome_contains_block cascade;
truncate table thing_property cascade;
truncate table mob cascade;
truncate table mob_gives_thing cascade;
truncate table mob_drops_thing cascade;
truncate table craft_recipe cascade;
truncate table baking_recipe cascade;
truncate table enchantment cascade;
truncate table enchantment_recipe cascade;
truncate table forging_recipe cascade;
truncate table brewing_recipe cascade;
alter sequence thing_id_seq restart with 1;