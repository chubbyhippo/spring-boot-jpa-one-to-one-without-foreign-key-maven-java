CREATE TABLE BOOK
(
    id     INT PRIMARY KEY NOT NULL,
    author VARCHAR(255)        NOT NULL,
    price  FLOAT               NOT NULL,
    title  VARCHAR(255)        NOT NULL
);

CREATE TABLE STUDENT
(
    id   INT PRIMARY KEY NOT NULL,
    name VARCHAR(255)    NOT NULL,
    gpa  FLOAT           NOT NULL
);

