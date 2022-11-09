DROP SCHEMA IF EXISTS registrering CASCADE;
CREATE SCHEMA registrering;
SET search_path TO registrering;

CREATE TABLE registrering (
    fornavn varchar(255) NOT NULL,
    etternavn varchar(255) NOT NULL,
    mobnr varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    kjonn varchar(255) NOT NULL,
    PRIMARY KEY (mobnr)
);


INSERT INTO
    registrering
VALUES
    ('Mikal', 'Bo', '12345678', 'passord', 'Kvinne');



------
SET search_path TO registrering;
select * from registrering