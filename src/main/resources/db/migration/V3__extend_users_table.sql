CREATE TABLE users (
    user_id IDENTITY PRIMARY KEY,
    username VARCHAR(25) NOT NULL,
    password VARCHAR(200) NOT NULL,
    authority VARCHAR(100),
    enabled INT DEFAULT NULL
);

INSERT INTO users (username, password, authority, enabled) VALUES
    ('user', '$2a$10$7TVqAqUkc04D3.E49aKKCOlN/HbHBwrnHaebLKZvZzY41BwPeLFpS', 'ROLE_USER', 1);