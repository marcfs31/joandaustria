drop DATABASE IF EXISTS ddl1;
CREATE DATABASE ddl;
use ddl;
drop TABLE IF EXISTS Problema1;
CREATE TABLE Problema1 (DNIAlumno char(9) primary key,Edad TINYINT unsigned, Nombre VarChar(30), Apellido VarChar(30), CodigoPostal char(5), Telefono1
char(9), Telefono2 char(9), Sexo Enum('H','M'));
insert into Problema1 values ('23866154C','18','Marc','Fors','08025','611418724','611418724','H');
insert into Problema1 values ('24866154C','18','Marc','Fors','08025','611418724','611418724','H');
insert into Problema1 values ('25866154C','18','Marc','Fors','08025','611418724','611418724','H');
insert into Problema1 values ('26866154C','18','Marc','Fors','08025','611418724','611418724','H');
insert into Problema1 values ('27866154C','18','Marc','Fors','08025','611418724','611418724','H');
insert into Problema1 values ('28866154C','18','Marc','Fors','08025','611418724','611418724','H');
select * from Problema1;
