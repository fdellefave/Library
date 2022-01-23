create table book
(
    id_book     int auto_increment
        primary key,
    title       varchar(255) null,
    author      varchar(255) null,
    description text         null,
    price       double       null,
    fk_category int          not null,
    constraint book_tpl_categoria_libro_id_categoria_libro_fk
        foreign key (fk_category) references tpl_book_category (id_book_category)
);

