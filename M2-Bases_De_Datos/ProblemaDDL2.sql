use ddl;
drop TABLE IF EXISTS Problema2;
CREATE TABLE Problema2 (Identificador INT Unsigned AUTO_INCREMENT primary key ,NombreModelo VarChar(20) charset utf32 default null UNIQUE, FechaFabricacion Date default '19990331', NumeroBastidor Char(17) default null) comment 'Problema2';
insert into Problema2 values (1,'DeezCar','1999-03-31','g2iu21g3h2h');
insert into Problema2 values (null,'DeezCar2','1999-03-31','g2iu21g3h2h');
insert into Problema2 values (null,default,'1999-03-31','g2iufassa');
insert into Problema2(NumeroBastidor) values ('dassdwadwa');
select * from Problema2;
