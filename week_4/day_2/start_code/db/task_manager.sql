DROP TABLE IF EXISTS tasks;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  first_name VARCHAR,
  last_name VARCHAR
);

CREATE TABLE tasks (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  description VARCHAR,
  duration INT,
  completed BOOLEAN DEFAULT FALSE,
  user_id INTEGER NOT NULL,
    FOREIGN KEY (user_id)
      REFERENCES users(id)
);