create table book
(
    id_book          int auto_increment
        primary key,
    title            varchar(255) null,
    description      text         null,
    price            double       null,
    quantity         int          not null,
    fk_book_category int          null,
    constraint book_tpl_book_category_id_book_category_fk
        foreign key (fk_book_category) references tpl_book_category (id_book_category)
);

