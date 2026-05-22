CREATE TABLE IF NOT EXISTS persona (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO personas (nombre, apellido, email) VALUES ('Isael', 'Fatama', 'isael.fatama@vallegrande.edu.pe');
INSERT INTO personas (nombre, apellido, email) VALUES ('Jose', 'Gonzales', 'jose.gonzales@vallegrande.edu.pe');