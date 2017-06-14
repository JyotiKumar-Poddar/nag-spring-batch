/**
 * Created by jyotipoddar on 6/14/2017.
 */

DROP TABLE IF EXISTS people;

CREATE TABLE people  (
    person_id BIGINT auto_increment NOT NULL PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);