

CREATE TABLE users (
    username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(50) NOT NULL,
    enabled BOOLEAN NOT NULL
);

CREATE table authorities(
    username varchar(50) not null,
    authority varchar(50) not null,

    constraint fk_authorities_users foreign key(username) references users(username)

);

create unique index ix_auth_username on authorities(username, authority);