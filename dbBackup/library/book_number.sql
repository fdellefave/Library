create table book_number
(
    id_book_number   int auto_increment
        primary key,
    creation_date    timestamp   null,
    last_update_date timestamp   null,
    isbn_code        varchar(13) not null
);

