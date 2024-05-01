CREATE TABLE users(
	id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
	name VARCHAR(225) NOT NULL,
	email VARCHAR(225) NOT NULL UNIQUE
);
