drop table PERSON if exists;

create table PERSON (ID integer identity primary key,
    FIRSTNAME varchar(50) not null,
    LASTNAME varchar(50) not null,
    DATE_OF_BIRTH date not null,
   );
