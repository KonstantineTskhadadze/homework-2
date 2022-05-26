CREATE TABLE IF NOT EXISTS person (
    person_id INTEGER PRIMARY KEY NOT NULL, 
    person_name VARCHAR(20) NOT NULL, 
    person_lastname VARCHAR(20) NOT NULL
);

INSERT INTO person (person_id, person_name, person_lastname ) VALUES(0, "Tinatin", "Tskhadadze");
INSERT INTO person (person_id, person_name, person_lastname ) VALUES(1, "Konstantine", "Tskhadadze");
INSERT INTO person (person_id, person_name, person_lastname ) VALUES(2, "Tea", "Nizharadze");
INSERT INTO person (person_id, person_name, person_lastname ) VALUES(3, "Andro", "Tskhadadze");
INSERT INTO person (person_id, person_name, person_lastname)  VALUES(4, "Tinatin", "Gogiberidze");