CREATE DATABASE test ENCODING 'UTF8';

CREATE TABLE user_data (
    id int4 NOT NULL,
    age int4,
    location int4,
    sent_count int4,
    user_id VARCHAR(255),
    username VARCHAR(255),
    PRIMARY KEY (id)
)