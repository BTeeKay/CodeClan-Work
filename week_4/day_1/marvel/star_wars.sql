.headers ON
.mode column
PRAGMA FOREIGN_KEYS = ON;

DROP TABLE lightsabers;
DROP TABLE characters;


CREATE TABLE characters (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name VARCHAR(255),
  darkside BOOLEAN,
  age INT
);

CREATE TABLE lightsabers (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    colour VARCHAR NOT NULL,
    hilt_metal VARCHAR NOT NULL,
    character_id INTEGER,
    FOREIGN KEY (character_id)
    REFERENCES characters (id)
);

INSERT INTO characters(name, darkside, age) VALUES ('Obi-Wan Kenobi', false, 27);
INSERT INTO characters(name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters(name, darkside, age) VALUES ('Darth Maul', true, 32);


INSERT INTO characters (name, darkside) values ('Yoda', false);

UPDATE characters SET (name, darkside) = ('Darth Vader', true) WHERE name = 'Anakin Skywalker';

INSERT INTO characters (name, darkside, age) VALUES ("Luke Skywalker", false, 17);

UPDATE characters set (age) = 65 WHERE name = 'Obi-Wan Kenobi';


INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);

INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('green', 'palladium', 1);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('red', 'gold', 3);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('cat', "horse", 4);

UPDATE characters set (age) = 26 WHERE id = 6;

SELECT * FROM characters;

SELECT * FROM lightsabers
