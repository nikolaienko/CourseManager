CREATE TABLE USERS (
        ID IDENTITY NOT NULL PRIMARY KEY,
        USERNAME VARCHAR(10) NOT NULL UNIQUE,
        PASSWORD VARCHAR(32) NOT NULL,
        ENABLED BOOLEAN
);
create table authorities (
  username varchar(10) not null ,
  authority varchar(256) not null default 'USER_ROLE',
  FOREIGN KEY (USERNAME) REFERENCES USERS(USERNAME)
);
CREATE TABLE COURSES (
  ID IDENTITY NOT NULL PRIMARY KEY,
  NAME varchar(10) not null,
  DESCRIPTION varchar(256)
);