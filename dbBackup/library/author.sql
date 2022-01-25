create table library.author
(
    id_author   int          not null
        primary key,
    name        varchar(255) not null,
    surname     varchar(255) not null,
    date_birth  date         null,
    local_birth varchar(255) null
);

