DROP DATABASE adlister_db;

CREATE DATABASE adlister_db;

use adlister_db;

CREATE table users(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username VARCHAR(50) not null,
  email VARCHAR(100),
  password varchar(100) not null,
  PRIMARY KEY (id)
);

create table ads(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id int unsigned not null,
  title varchar(100),
  description text,
  primary key (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);