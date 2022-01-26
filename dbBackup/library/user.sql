create table user
(
    id_user int auto_increment
        primary key,
    name    varchar(255) not null,
    surname varchar(255) not null,
    balance double       null
);

