use consultas_basicas
select (select dnombre from depart where depart.dept_no=emple.dept_no) Departamento , apellido Apellido from emple;
select avg(salario) Salario, (select dnombre from depart where depart.dept_no=emple.dept_no) Departamento from emple;
