ALTER TABLE authorities ALTER COLUMN authority SET DEFAULT 'ROLE_USER';

DELETE FROM authorities;

INSERT INTO authorities VALUES ('test',DEFAULT );
INSERT INTO authorities VALUES('test1',DEFAULT );
INSERT INTO authorities VALUES('vlad',DEFAULT );