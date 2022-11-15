DROP TABLE IF EXISTS schedule;

CREATE TABLE schedule (
    id INT NOT NULL AUTO_INCREMENT,
    created_at DATE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    title VARCHAR(30) NOT NULL,
    datetime　INT(15)NOT NULL,
    location　VARCHAR(50)NOT NULL,
    contents VARCHAR(300)NOT NULL
    PRIMARY KEY (id)
);

INSERT INTO schedule (id,register,title,datetime,location,contents) VALUES ('タイトル',20221231,'伊勢神宮','初詣に向かいたいと思います。');
