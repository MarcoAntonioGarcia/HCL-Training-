#Creación de base de datos con tabla y eliminación de la misma.
CREATE DATABASE BasePueba
CREATE TABLE Prueba(
    PruebaTablaID int
);
DROP DATABASE BasePueba
DROP TABLE Prueba

#Creación de base de datos escuela con 3 tablas
CREATE DATABASE Escuela
CREATE TABLE Estudiantes (
    EstudianteID int NOT NULL,
	Nombre varchar(255),
    Direccion varchar(255),
    Edad varchar(255), 
    PRIMARY KEY (EstudianteID)
);

CREATE TABLE Cursos (
    CursoID int NOT NULL PRIMARY KEY,
	Nombre varchar(255),
    Creditos varchar(255)
);


CREATE TABLE Inscripcion(
    EstudianteID int NOT NULL,
    CursoID int NOT NULL,
	FOREIGN KEY (EstudianteID) REFERENCES Estudiantes(EstudianteID),
    FOREIGN KEY (CursoID) REFERENCES Cursos(CursoID)
);


