SELECT * FROM Estudiantes
INSERT INTO Estudiantes (EstudianteID, Nombre, Direccion, Edad) VALUES (1,'Luis', 'Calle1','22');
INSERT INTO Estudiantes (EstudianteID, Nombre, Direccion, Edad) VALUES (2,'Marco', 'Calle7','21');
INSERT INTO Estudiantes (EstudianteID, Nombre, Direccion, Edad) VALUES (3,'Juan', 'Calle3','24');
INSERT INTO Estudiantes (EstudianteID, Nombre, Direccion, Edad) VALUES (4,'Allan', 'Calle2','20');
INSERT INTO Estudiantes (EstudianteID, Nombre, Direccion, Edad) VALUES (5,'Jose', 'Calle5','23');
INSERT INTO Estudiantes (EstudianteID, Nombre, Direccion, Edad) VALUES (6,'Adrian', 'Calle1','21');

SELECT * FROM Cursos
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (1,'Matematicas', 10);
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (2,'Español', 10);
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (3,'Historia', 8);
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (4,'Fisica', 10);
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (5,'Ciencias', 6);
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (6,'Deportes', 10);
INSERT INTO Cursos (CursoID, Nombre, Creditos) VALUES (7,'Artes', 5);

SELECT * FROM Inscripcion
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,7);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,2);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,3);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,4);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,5);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,6);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (1,1);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (2,7);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (2,6);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (2,4);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (2,1);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (4,7);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (4,1);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (5,1);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (5,2);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (5,3);
INSERT INTO Inscripcion (EstudianteID, CursoID) VALUES (5,5);






