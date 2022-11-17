classDiagram
direction BT
class baking_recipe {
   integer in
   integer out
}
class biom {
   varchar(64) name
   boolean type
   integer id
}
class biom_contains_block {
   integer biom_id
   integer block_id
}
class block {
   varchar(64) name
   integer picture_id
   varchar(64) type
   integer id
}
class craft_reciepe {
   integer a1
   integer a2
   integer a3
   integer a4
   integer a5
   integer a6
   integer a7
   integer a8
   integer a9
   integer result
}
class enchantment {
   varchar(10) name
   integer id
}
class enchantment_recipe {
   integer experience
   integer bookshelfs
   integer level
   integer in_id
   integer out_id
   integer enchantment_id
   integer id
}
class forging_recipe {
   integer input
   integer source
   integer output
   integer experience
   integer id
}
class mob {
   varchar(64) name
   integer id
}
class mob_drops_thing {
   integer mob_id
   integer thing_id
}
class mob_gives_thing {
   integer tool_id
   integer mob_id
   integer thing_id
}
class thing {
   varchar(64) name
   varchar(64) type
   integer picture_id
   boolean flammability
   boolean putability
   integer id
}
class thing_breaks_block {
   integer thing_id
   integer block_id
}
class thing_falls_from_bloc {
   integer thing_id
   integer block_id
}
class thing_property {
   integer thing_id
   varchar(64) name
   varchar(64) type
   varchar(64) value
   integer id
}

baking_recipe  -->  thing : in:id
baking_recipe  -->  thing : out:id
biom_contains_block  -->  biom : biom_id:id
biom_contains_block  -->  block : block_id:id
craft_reciepe  -->  thing : a4:id
craft_reciepe  -->  thing : a7:id
craft_reciepe  -->  thing : a9:id
craft_reciepe  -->  thing : a1:id
craft_reciepe  -->  thing : result:id
craft_reciepe  -->  thing : a6:id
craft_reciepe  -->  thing : a3:id
craft_reciepe  -->  thing : a2:id
craft_reciepe  -->  thing : a5:id
craft_reciepe  -->  thing : a8:id
enchantment_recipe  -->  enchantment : enchantment_id:id
enchantment_recipe  -->  thing : in_id:id
enchantment_recipe  -->  thing : out_id:id
forging_recipe  -->  thing : output:id
forging_recipe  -->  thing : input:id
forging_recipe  -->  thing : source:id
mob_drops_thing  -->  mob : mob_id:id
mob_drops_thing  -->  thing : thing_id:id
mob_gives_thing  -->  mob : mob_id:id
mob_gives_thing  -->  thing : tool_id:id
mob_gives_thing  -->  thing : thing_id:id
thing_breaks_block  -->  block : block_id:id
thing_breaks_block  -->  thing : thing_id:id
thing_falls_from_bloc  -->  block : block_id:id
thing_falls_from_bloc  -->  thing : thing_id:id
thing_property  -->  thing : thing_id:id
