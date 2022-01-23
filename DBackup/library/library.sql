create table library
(
    id_library     int auto_increment
        primary key,
    fk_book        int  not null,
    quantity       int  not null,
    rental_date    date null,
    fk_rental_user int  null,
    constraint library_book_id_book_fk
        foreign key (fk_book) references book (id_book),
    constraint library_user_id_user_fk
        foreign key (fk_rental_user) references user (id_user)
);

