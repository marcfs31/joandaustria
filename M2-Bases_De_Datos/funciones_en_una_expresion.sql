-- Problema Funciones1
use world;
select char_length(Name) from country;
select instr(Name,' ') from country;
select strcmp('Armenia',Name),Name from country where Continent='Asia';
select 'Existe',Name from country where strcmp('Armenia',Name)=0;
select concat(Name,' pertenece al continente ',Continent) from country;
select upper(substring(Name,1,3)) from country where Continent='Europe';
select substring_index(Name,' ',1) from country;

-- Problema Funciones2
select Name from country where Continent='Europe' and Name like 'A%';
select Name from country where Continent='Africa' and Name like '%h%';
select Name from country where Continent='Africa' and Name like '%h%' and Name like '%m%';
select Name from country where Name like '____r';

-- Extras
select Name from country where Name like '% %' order by instr(Name,' ');
select Name from country where Name like '% %' order by instr(Name,' ') limit 1;
select Name from country order by char_length(Name) desc limit 1;
select Name from country order by population desc limit 1;

-- Problema Funciones3
select curdate();
select char_length(curdate());
select NOW()+INTERVAL 20 DAY;
select NOW()-INTERVAL 1 YEAR-INTERVAL 20 DAY;
select date('1990-6-10')+interval 3 month+interval 5 day;
select date_format(now(),'%D de %M de %Y');
set lc_time_names='es_ES';
select date_format(now(),'%d de %M de %Y');
select to_days(19920101)-to_days(19901231);

-- Problema Funciones4
select Name,Population div SurfaceArea Personas from country order by 2 desc;
select Name,IndepYear from country where mod(IndepYear,2)=0;
select Name,Continent,truncate(LifeExpectancy,0) from country order by 3 desc limit 5;
select Name,IndepYear*SurfaceArea from country where Continent="Europe" or Continent="Africa";
select * from country where ceil(GNP)=64\G;

-- Problema Funciones5
select ifnull(Capital,"Sin Capital") from country;
select if(SurfaceArea>Population,lower(Name),upper(Name)) from country;
select case SurfaceArea>Population when true then lower(Name) else upper(Name) end from world.country;
select case when SurfaceArea>Population then lower(Name) else upper(Name) end from world.country;
-- El de arriba hace lo mismo que los 2 anteriores
