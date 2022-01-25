create table library.library
(
    id_library int auto_increment
        primary key,
    fk_book    int not null,
    constraint library_book_id_book_fk
        foreign key (fk_book) references library.book (id_book)
);

