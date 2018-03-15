use consultas_basicas
select (select dnombre from depart where depart.dept_no=emple.dept_no) Departamento , apellido Apellido from emple;
select avg(salario) Salario, (select dnombre from depart where depart.dept_no=emple.dept_no) Departamento from emple group by 2;
select count(*), (select dnombre from depart where depart.dept_no=emple.dept_no) as n_depart from emple where year(fecha_alt)="1991" group by dept_no;
select dnombre, (select avg(comision) from emple where emple.dept_no=depart.dept_no) as Media_Comisiones from depart order by 2 desc limit 1;
select oficio, salario from emple where emple.dept_no=(select depart.dept_no from depart where loc="Madrid");
