/*CREATE DATABASE  "register-office"
  WITH ENCODING='UTF8'
       OWNER=papa
       CONNECTION LIMIT=-1;*/

DROP TABLE IF EXISTS person;

CREATE TABLE person (
    person_id SERIAL,
    first_name varchar(100),
    last_name varchar(100),
    PRIMARY KEY (person_id)
);