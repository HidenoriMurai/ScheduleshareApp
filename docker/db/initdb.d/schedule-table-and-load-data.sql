DROP TABLE IF EXISTS schedule;

CREATE TABLE schedule (
    id INT AUTO_INCREMENT,
    created_at DATE NOT NULL,
    title VARCHAR(30) NOT NULL,
    scheduletime　DATE　NOT NULL,
    location　VARCHAR(50) NOT NULL,
    contents VARCHAR(300) NOT NULL
    PRIMARY KEY (id)
);

INSERT INTO schedule (created_at,title,scheduletime,location,contents) VALUES ('2022-11-11','タイトル','2022-12-31','伊勢神宮','初詣に向かいたいと思います。');
