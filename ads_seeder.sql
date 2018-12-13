use adlister_db;

TRUNCATE TABLE users;

INSERT INTO users (username, email, password) VALUES
  ('Bob', 'Bob@email.com', 'Bob123'),
  ('Steve', 'Steve@email.com', 'Steve123'),
  ('Will', 'Will@email.com', 'Will123'),
  ('Bobo', 'Bobo@email.com', 'Bobo123');

INSERT into ads(user_id, title, description) VALUES
(1,'Heres Something', 'Got some stuff'),
(2,'Heres another', 'Got more some stuff'),
(3,'Heres Something else', 'Got jidjpgf some stuff'),
(4,'Heres Something other', 'Got not stuff');