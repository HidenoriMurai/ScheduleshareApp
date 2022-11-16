DROP TABLE IF EXISTS schedule;

CREATE TABLE schedule (
    id INT AUTO_INCREMENT,
    register_date DATE NOT NULL,
    title VARCHAR(30) NOT NULL,
    schedule_date DATE NOT NULL,
    location VARCHAR(50) NOT NULL,
    content VARCHAR(300) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO schedule (register_date,title,schedule_date,location,content) VALUES ('2022-11-11','タイトル','2022-12-31','伊勢神宮','初詣に向かいたいと思います。');
INSERT INTO schedule (register_date,title,schedule_date,location,content) VALUES ('2022-11-24','タイトル','2022-12-08','鳥羽周辺','釣りをしに向かいます。');
INSERT INTO schedule (register_date,title,schedule_date,location,content) VALUES ('2022-11-14','タイトル','2022-12-08','周辺','向かいます。');
