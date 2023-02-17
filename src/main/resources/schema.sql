CREATE TABLE BOOK
(
    id     BIGINT PRIMARY KEY NOT NULL,
    author VARCHAR(255)       NOT NULL,
    price  DOUBLE             NOT NULL,
    title  VARCHAR(255)       NOT NULL
);

CREATE TABLE STUDENT
(
    id   BIGINT PRIMARY KEY NOT NULL,
    name VARCHAR(255)       NOT NULL,
    gpa  DOUBLE             NOT NULL
);

