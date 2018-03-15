use world;
select name, population from city where population > (select population from city where name="New York") order by population desc limit 3;
select name as Pais, (select count(name) from city where countrycode=code) as CantidadCiudades from country where region="Nordic Countries";
select language from countrylanguage where countrycode=(select countrycode from city where name="Singapore") order by 1 desc;
select distinct continent, group_concat(name) from country where code = any (select countrycode from countrylanguage where language="English" and percentage > 50) group by 1;
select distinct continent from country where (select if(percentage>50, true, false) from countrylanguage where countrycode=country.code and language="english");
select name from country where code = (select countrycode from city order by population desc limit 1);
select name from country where code = (select countrycode from city where population=(select max(population) from city));
