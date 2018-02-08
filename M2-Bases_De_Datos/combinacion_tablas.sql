use world;
select city.Name, country.Name from city ci ,country co where co.countrycode=ci.code;
select countrylanguage.language, country.name from countrylanguage,country where countrycode=code;
select city.Name, country.Name from city,country where countrycode=code order by city.population desc limit 10;
select city.Name, country.Name from city,country where country.Name="Ukraine" and countrycode=code; -- countrycode=code es para hacer un join
select countrylanguage.language, country.name from countrylanguage, country where country.continent="Africa" and countrycode=code;
select sum(city.population), country.name from city,country where country.Name="Russian Federation" and countrycode=code;
select country.population-sum(city.population) from city, country where city.countrycode=country.code and country.name="Russian Federation" group by city.countrycode;

-- Consultas clase

use consultas_basicas;
select emple.apellido, depart.dnombre from emple, depart where emple.dept_no=depart.dept_no;
select emple.apellido, depart.dnombre, depart.loc from emple, depart where emple.dept_no=depart.dept_no and depart.loc="Sevilla";
select avg(emple.salario), depart.dnombre from emple, depart where emple.dept_no=depart.dept_no group by 2;
select sum(emple.salario), depart.dnombre from emple, depart where emple.dept_no=depart.dept_no group by 2 order by 1 desc limit 1;
select count(emple.oficio), depart.loc from emple, depart where emple.dept_no=depart.dept_no and emple.oficio="vendedor" group by 2;
select depart.dnombre,group_concat(emple.fecha_alt separator "#") 'Fechas alta' from emple, depart where emple.dept_no=depart.dept_no group by 1;
select j.apellido jefe,j.emp_no, e.apellido empleado,e.dir from emple e, emple j;

-- Problema JOIN2
use world;
select country.Name, city.Name from country inner join city on country.capital=city.id;
select country.name, city.countrycode, city.Name from country inner join city on country.capital=city.id where city.countrycode="CHE" or city.countrycode="ATA";
select country.name, city.Name from country left join city on country.capital=city.id where code in ("CHE","ATA");
select country.name, city.countrycode, city.Name from country left outer join city on country.capital=city.id where city.countrycode="CHE" or city.countrycode="ATA";
select country.name, city.Name from country left outer join city on country.capital=city.id where code in ("CHE","ATA");
select country.name, city.countrycode, city.Name from country right outer join city on country.capital=city.id where city.countrycode="CHE" or city.countrycode="ATA";
select country.name, city.Name from country right join city on country.capital=city.id where code in ("CHE","ATA");
select country.name, city.district from country inner join city on code=countrycode where city.name="San Antonio";
select countrylanguage.language from countrylanguage join country on code=countrycode where country.name="Sweden";
select country.name, countrylanguage.language from country join countrylanguage on countrycode=code where language="french" and  percentage=50;
-- , countrylanguage.* muestra todo
-- count(*)
set sql_mode="";
select country.name, count(*), countrylanguage.language from countrylanguage inner join country on code=countrycode group by countrycode having count(countrylanguage.language)=1 and countrylanguage.language="French";
select city.name, city.population, country.name from country join city on code=countrycode where city.population>7000000;
select country.name, count(*) from country join city on code=countrycode group by country.name order by 2 desc limit 1;
