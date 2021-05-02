CREATE TABLE TOPIC
(
    id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    title   VARCHAR(400)  NOT NULL,
    content VARCHAR(2000) NULL,
    created timestamp
);

CREATE TABLE COMMENT
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    topic_id BIGINT        NOT NULL,
    content  VARCHAR(2000) NULL,
    created  timestamp
);

ALTER TABLE COMMENT
    ADD CONSTRAINT comment_topic_id
        FOREIGN KEY (topic_id) REFERENCES topic (id)