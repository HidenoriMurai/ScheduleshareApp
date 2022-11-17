DROP TABLE IF EXISTS schedule;

CREATE TABLE schedule (
    id INT AUTO_INCREMENT,
    title VARCHAR(30) NOT NULL,
    scheduleDate DATE NOT NULL,
    location VARCHAR(50) NOT NULL,
    content VARCHAR(300) NOT NULL,
    registerDate DATE NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO schedule (title,scheduleDate,location,content,registerDate) VALUES ('タイトル','2022-12-31','伊勢神宮','初詣に向かいたいと思います。','2022-11-11');
INSERT INTO schedule (title,scheduleDate,location,content,registerDate) VALUES ('タイトル','2022-12-08','鳥羽周辺','釣りをしに向かいます。','2022-11-24');
INSERT INTO schedule (title,scheduleDate,location,content,registerDate) VALUES ('タイトル','2022-12-08','周辺','向かいます。','2022-11-14');
