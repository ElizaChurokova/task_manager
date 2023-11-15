create sequence hibernate_sequence start 1 increment 1;

CREATE TABLE usr (
    id int8 not null,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    address varchar(255) not null,
    phone number int,
    department varchar(255) not null,
    position varchar(255) not null,
    primary key (id)
);

CREATE TABLE Department (
    id int8 not null,
    department_name varchar(255) not null,
    manager_id int8 not null
);

CREATE TABLE Position (
    id int8 not null,
    name varchar(255) not null
);

CREATE TABLE Manager (
    id int8 not null,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    position varchar(255) not null,
    user_id int8 not null,
    department_id int8 not null
);

CREATE TABLE Task (
    id int8 not null,
    name varchar(255),
    user_id int8 not null,
    manager_id int8 not null,
    start_time date,
    end_time date,
    priority varchar(10),
    document_id int8 not null
);

CREATE TABLE Message (
    id int8 not null,
    text varchar(10000) not null,
    name_from varchar(255) not null,
    name_to varchar(255) not null,
    user_id int8 not null,
    date date not null
);

CREATE TABLE Document (
    id int8 not null,
    document_name varchar(255)
)


