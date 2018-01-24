use consultas_basicas
select count(emp_no),dept_no from emple group by dept_no;
select count(emp_no),dept_no from emple group by dept_no having count(emp_no)>5;
select avg(salario),dept_no from emple group by dept_no;
select group_concat(apellido) from emple where oficio="vendedor" group by dept_no having dept_no=30;
select count(emp_no) from emple where oficio="vendedor" and dept_no=30;
select group_concat(oficio) from emple group by dept_no having dept_no=30;
select count(emp_no),dept_no from emple where oficio="empleado" group by dept_no;
select dept_no,count(emp_no) from emple group by dept_no order by 2 desc limit 1;
select sum(salario),oficio from emple group by oficio;
select sum(salario),oficio,dept_no from emple where dept_no=30 group by oficio;
select dept_no from emple where oficio="EMPLEADO" group by dept_no order by count(emp_no) desc limit 1;
select count(distinct oficio),dept_no from emple group by dept_no;
select count(oficio), dept_no, oficio from emple group by 2,3;
select group_concat(oficio order by salario desc), dept_no from emple group by 2;


-- Consultas clase random
-- use world;
-- select region, sum(population) from country group by region order by 2 limit 5;
-- select group_concat(distinct region) 'Region' from country group by continent having sum(population>1000000000);

use consultas_basicas;

select count(dni),localidad from personas group by localidad desc;
select avg(salario),funcion from personas group by funcion desc;
select avg(salario),funcion from personas where salario>2500 group by funcion desc having avg(salario)>2500;
select avg(salario),localidad from personas group by localidad asc limit 1;
select count(dni),localidad,funcion from personas group by 2,3;
select count(dni),cod_hospital,localidad from personas group by 2,3;
select char_length(substring_index(apellidos,',',1)),apellidos from personas order by 1 desc limit 1;
select localidad,max(char_length(substring_index(apellidos,',',1))) from personas group by 1 order by 2 desc;
select sum(salario is not null) from personas;
select count(dni) from personas where dni mod 5=0 group by cod_hospital;
