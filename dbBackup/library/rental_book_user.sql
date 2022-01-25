create table library.rental_book_user
(
    id_rental_book_user int not null
        primary key,
    fk_user             int null,
    fk_book             int null,
    rental_date         int not null,
    constraint rental_book_user_book_id_book_fk
        foreign key (fk_book) references library.book (id_book),
    constraint rental_book_user_user_id_user_fk
        foreign key (fk_user) references library.user (id_user)
);

