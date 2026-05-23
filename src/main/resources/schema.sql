DROP TABLE IF EXISTS PERSONAS;

CREATE TABLE PERSONAS (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO PERSONAS (nombre, apellido, email) 
VALUES ('Isael', 'Fatama', 'isael.fatama@vallegrande.edu.pe');