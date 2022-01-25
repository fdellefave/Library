create table library.book
(
    id_book     int auto_increment
        primary key,
    title       varchar(255) null,
    fk_author   int          null,
    description text         null,
    price       double       null,
    quantity    int          not null,
    fk_category int          not null,
    constraint book_author_id_author_fk
        foreign key (fk_author) references library.author (id_author),
    constraint book_tpl_categoria_libro_id_categoria_libro_fk
        foreign key (fk_category) references library.tpl_book_category (id_book_category)
);

