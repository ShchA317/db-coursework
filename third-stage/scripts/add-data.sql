insert into thing(name, type, game_id)
VALUES
    ('Камень', 'block', '1'),
    ('Дерн', 'block', '2'),
    ('Земля', 'block', '3'),
    ('Булыжник', 'block', '4'),
    ('Дубовые доски', 'block', '5-0'),
    ('Еловые доски', 'block',  '5-1'),
    ('Березовые доски', 'block',  '5-2'),
    ('Доски тропического дерева', 'block',  '5-3'), -- 1-5
    ('Песок', 'block', '12'),
    ('Гравий', 'block', '13'),
    ('Золотая руда', 'block', '14'),
    ('Железная руда', 'block', '15'),
    ('Угольная руда', 'block', '16'),
    ('Дубовая древесина', 'block',  '17-0'),
    ('Еловая древесина', 'block',  '17-1'),
    ('Березовая древесина', 'block',  '17-2'),
    ('Древесина тропического дерева', 'block',  '17-3'),
    ('Листва дуба', 'block', '18-0'),
    ('Листва ели', 'block', '18-1'),
    ('Листва березы', 'block', '18-2'),
    ('Листва тропического дерева', 'block', '18-3'),
-- пропущена губка (19)
    ('Стекло', 'block', '20'),
-- пропущены предметы 21 - 40
    ('Золотой блок', 'block', '41'),
    ('Железный блок', 'block', '42'),
-- пропущены предметы 42 - 43
    ('Каменная плита', 'block', '44-0'),
    ('Песчанниковая плита', 'block', '44-1'),
--   ('Деревянная плита', 'block', '44-2'),
    ('Булыжниковая плита', 'block', '44-3'),
    ('Кирпичная плита', 'block', '44-4'),
    ('Плита из каменного кирпича', 'block', '44-5'),
    ('Плита из адского кирпича', 'block', '44-6'),
    ('Мраморная плита', 'block', '44-7'),
-- пропущены предметы 45 - 55

    ('Алмазная руда', 'block', '56'),
    ('Алмазный блок', 'block', '57'),
    ('Верстак', 'block',  '58'),
    ('Факел', 'block', '59'),
    -- пропущены предметы 60
    ('Печь', 'block', '61'),
    -- пропущены предметы 62-115
    ('Стол зачарований', 'block', '116'),
    ('Варочная стойка', 'block', '117'),
    -- пропущены предметы 118-125
    ('Дубовая плита', 'block', '126-0'),
    ('Еловая плита', 'block', '126-1'),
    ('Березовая плита', 'block', '126-2'),
    ('Джунглевая плита', 'block', '126-3'),
    -- пропущены предметы 118-125
    ('Наковальня','block', '145-0'),
    -- пропущены предметы 146-158
    ('Железная лопата','item', '256'),
    ('Железная кирка','item', '257'),
    ('Железный топор','item', '258'),
    -- пропущены предметы 259-262
    ('Уголь','item',  '263-0'),
    ('Древесный уголь','item',  '263-1'),
    ('Алмаз','item', '264'),
    ('Железный слиток','item', '265'),
    ('Золотой слиток','item', '266'),
    ('Железный меч','item', '267'),
    ('Деревянный меч','item',  '268'),
    ('Деревянная лопата','item',  '269'),
    ('Деревянная кирка','item',  '270'),
    ('Деревянный топор','item',  '271'),
    ('Каменный меч','item', '272'),
    ('Каменная лопата','item', '273'),
    ('Каменная кирка','item', '274'),
    ('Каменный топор','item', '275'),
    ('Алмазный меч','item', '276'),
    ('Алмазная лопата','item', '277'),
    ('Алмазная кирка','item', '278'),
    ('Алмазный топор','item', '279'),
    ('Палка','item',  '280'),
    -- пропущены предметы 281 и 282
    ('Золотой меч','item', '283'),
    ('Золотая лопата','item', '284'),
    ('Золотая кирка','item', '285'),
    ('Золотой топор','item', '286'),
    -- пропущены предметы 287 - 389
    ('Золотой самородок','item', '380')
    -- не дописаны предметы 381 - 2267
;


insert into craft_recipe (
                           a1,
                           result
                          )
values
    (
     (select id from thing t where t.name='Дубовая древесина'),
     (select id from thing t where t.name='Дубовые доски')
    ),
    (
     (select id from thing t where t.name='Еловая древесина'),
     (select id from thing t where t.name='Еловые доски')
    ),
    (
     (select id from thing t where t.name='Березовая древесина'),
     (select id from thing t where t.name='Березовые доски')
    ),
    (
     (select id from thing t where t.name='Древесина тропического дерева'),
     (select id from thing t where t.name='Доски тропического дерева')
    )
;


insert into craft_recipe (
                           a1,
                           a4,
                           result,
                          craft_result_quantity
                          )
values
        (
            (select id from thing t where t.name='Доски тропического дерева'),
            (select id from thing t where t.name='Доски тропического дерева'),
            (select id from thing t where t.name='Палка'),
            4
        ),
        (
            (select id from thing t where t.name='Дубовые доски'),
            (select id from thing t where t.name='Дубовые доски'),
            (select id from thing t where t.name='Палка'),
            4
        ),
        (
            (select id from thing t where t.name='Еловые доски'),
            (select id from thing t where t.name='Еловые доски'),
            (select id from thing t where t.name='Палка'),
            4
        ),
        (
            (select id from thing t where t.name='Березовые доски'),
            (select id from thing t where t.name='Березовые доски'),
            (select id from thing t where t.name='Палка'),
            4
        ),
        (
            (select id from thing t where t.name='Палка'),
            (select id from thing t where t.name='Уголь'),
            (select id from thing t where t.name='Факел'),
            4
        )
;

insert into craft_recipe(
                         a1,
                         result,
                         craft_result_quantity
)
values (
            (select id from thing t where t.name='Золотой блок'),
            (select id from thing t where t.name='Золотой слиток'),
            9
        ),
        (
            (select id from thing t where t.name='Железный блок'),
            (select id from thing t where t.name='Железный слиток'),
            9
        ),
        (
             (select id from thing t where t.name='Золотой слиток'),
            (select id from thing t where t.name='Золотой самородок'),
            9
       );

insert into craft_recipe(a1, a2, a3, a4, a5, a6, a7, a8, a9, result)
VALUES (
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой слиток'),
        (select id from thing t where t.name='Золотой блок')
       ),
       (
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный слиток'),
        (select id from thing t where t.name='Железный блок')
       ),
       (
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой самородок'),
        (select id from thing t where t.name='Золотой слиток')
       );


insert into craft_recipe (
                           a4,
                           a5,
                           a6,
                           result
                          )
values
    (
        (select id from thing t where t.name='Доски тропического дерева'),
        (select id from thing t where t.name='Доски тропического дерева'),
        (select id from thing t where t.name='Доски тропического дерева'),
        (select id from thing t where t.name='Джунглевая плита')
    ),
    (
        (select id from thing t where t.name='Дубовые доски'),
        (select id from thing t where t.name='Дубовые доски'),
        (select id from thing t where t.name='Дубовые доски'),
        (select id from thing t where t.name='Дубовая плита')
    ),
    (
        (select id from thing t where t.name='Еловые доски'),
        (select id from thing t where t.name='Еловые доски'),
        (select id from thing t where t.name='Еловые доски'),
        (select id from thing t where t.name='Еловая плита')
    ),
    (
        (select id from thing t where t.name='Березовые доски'),
        (select id from thing t where t.name='Березовые доски'),
        (select id from thing t where t.name='Березовые доски'),
        (select id from thing t where t.name='Березовая плита')
    ),
    (
        (select id from thing t where t.name='Камень'),
        (select id from thing t where t.name='Камень'),
        (select id from thing t where t.name='Камень'),
        (select id from thing t where t.name='Каменная плита')
    ),
    (
        (select id from thing t where t.name='Булыжник'),
        (select id from thing t where t.name='Булыжник'),
        (select id from thing t where t.name='Булыжник'),
        (select id from thing t where t.name='Булыжниковая плита')
    )
;

insert into biome(id, name, type) values (1, 'Равнина', true);
insert into block (id, name, picture_id, type)
values (1, 'Блок земли', 3, 'Обыкновенный блок');

insert into biome_block(biome_id, block_id)
values
    (
     (select id from biome where name='Равнина'),
     (select id from block where name='Блок земли')
    );

insert into baking_recipe("in", out)
values
    (
     (select id from thing where name='Булыжник'),
     (select id from thing where name='Камень')
    ),
    (
     (select id from thing where name='Золотая руда'),
     (select id from thing where name='Золотой слиток')
    );

insert into forging_recipe(input, source, output, experience)
values
    (
     (select id from thing where name='Железная кирка'),
     (select id from thing where name='Железный слиток'),
     (select id from thing where name='Железная кирка'),
     2 -- положим, что такая ковка стоит 2 опыта
    )
--
-- insert into craft_recipe(a1, a2, a4, a5, result)
-- values
--     (
--      (select id from thing t where t.name='Доски тропического дерева'),
--      (select id from thing t where t.name='Доски тропического дерева'),
--      (select id from thing t where t.name='Доски тропического дерева'),
--      (select id from thing t where t.name='Доски тропического дерева'),
--      (select id from thing t where t.name='Верстак')
--     ),
--     (
--      (),
--     )