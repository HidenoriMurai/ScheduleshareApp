DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT,
    name VARCHAR(32) NOT NULL,
    email VARCHAR(32) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO users (name,email) VALUES ('Murai','xxxx@mail.co.jp');
INSERT INTO users (name,email) VALUES ('Yamada','xxxx@mail.co.jp');
INSERT INTO users (name,email) VALUES ('Yamaguti','xxxx@mail.co.jp');
INSERT INTO users (name,email) VALUES ('Matuo','xxxx@mail.co.jp');
