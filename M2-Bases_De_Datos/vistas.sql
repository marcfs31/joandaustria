use consultas_basicas;
-- 1
create view EMPDEP as select emple.* ,depart.dnombre from emple join depart on emple.dept_no=depart.dept_no;
select * from EMPDEP;

-- 2
create view pares as select dnombre from depart where dept_no%2=0;
    insert into depart values (11,"impar","dasd");
select * from pares;

-- 3
-- Se cambia en la tabla original
update EMPDEP set comision=99 where apellido="SÁNCHEZ";

-- 4
update EMPDEP set dnombre="ALGO" where apellido="SÁNCHEZ";

-- 5
delete from EMPDEP where apellido="SÁNCHEZ";

-- 6 no se puede insertar si se usan más de 1 tabla en la vista
insert into EMPDEP(emp_no,apellido,dnombre) values (100, "López","")

-- 7
insert into pares

-- 8 con el check option fuerzas que al insertar se tenga que cumplir el where de la view
alter view pares as select dept_no, dnombre from depart where mod(dept_no,2)= 0 with check option;
