create table library.tpl_book_category
(
    id_book_category int auto_increment
        primary key,
    category         varchar(255) not null,
    constraint tpl_categoria_libro_categoria_uindex
        unique (category)
);

