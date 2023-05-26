DROP TABLE IF EXISTS NOMBRE_TABLA;
CREATE TABLE Odontologos(INT numeroMatricula, nombre VARCHAR(100) NOT NULL, apellido INT NOT NULL);


-- para test --
INSERT INTO  Odontologos(numeroMatricula, nombre, apellido) VALUES ('1234', 'Julian', 'Delgado'), ('4567', 'Serrana', 'Marset');