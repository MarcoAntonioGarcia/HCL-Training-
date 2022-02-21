#Para consultar las tablas.
select * from Estudiantes;
select * from Cursos;
select * from Inscripcion;

#Estudiantes inscritos y no inscritos
SELECT * FROM Estudiantes where EstudianteID in (select distinct EstudianteID from Inscripcion)
SELECT * FROM Estudiantes where EstudianteID not in (select distinct EstudianteID from Inscripcion)


#Encontrar los numeros de materias inscritas por estudiante pero con los IDs
select * from Inscripcion
select EstudianteID, count(CursoID) as NumeroDeCursos from Inscripcion
group by EstudianteID 

#Creación de View
CREATE VIEW Auxiliar as 
select EstudianteID, count(CursoID) as NumeroDeCursos from Inscripcion
group by EstudianteID;

Select * From Auxiliar


SELECT Estudiantes.*, Auxiliar.NumeroDeCursos
FROM Estudiantes 
JOIN Auxiliar on Estudiantes.EstudianteID=Auxiliar.EstudianteID


SELECT Estudiantes.*, Auxiliar.NumeroDeCursos
FROM Estudiantes 
JOIN Auxiliar on Estudiantes.EstudianteID=Auxiliar.EstudianteID
WHERE Auxiliar.NumeroDeCursos=(Select max(NumeroDeCursos) FROM Auxiliar)

