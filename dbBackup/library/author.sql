create table author
(
    id_author   int          not null
        primary key,
    name        varchar(255) not null,
    surname     varchar(255) not null,
    date_birth  date         null,
    local_birth varchar(255) null,
    fk_book     int          null,
    constraint author_book_id_book_fk
        foreign key (fk_book) references book (id_book)
);

