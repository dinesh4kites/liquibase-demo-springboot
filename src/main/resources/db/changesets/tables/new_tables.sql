
CREATE TABLE person (
	id serial PRIMARY KEY,
	firstName VARCHAR ( 250 ) NOT NULL,
	lastName VARCHAR ( 250 ) NOT NULL,
	age INT NOT NULL,
	email VARCHAR ( 255 ) UNIQUE NOT NULL
);