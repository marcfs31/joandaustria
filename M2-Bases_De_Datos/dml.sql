use world;
insert into GelderlandDist (name,district,countrycode,Inauguration) values("Sakila","Gelderland", "SQL", 20010701); -- Sin poner los nombres de las tablas tambien va
insert into GelderlandDist (name,countrycode,Inauguration) values ("MySQLland", "MYS", 19840904),("Fantasia", "FNT", 19500101);
replace into GelderlandDist (name,countrycode,Inauguration) values ("MySQLland", "SQL", 19840904);
update Gelderland set Inauguration=19800517 where name="Ede";
update GelderlandDist set countrycode="FOO" where countrycode="NLD" order by name limit 2;
delete from GelderlandDist where countrycode="FOO" limit 1;
create table newcity like city;
insert into newcity select * from city where district in ("Ontario","England");-- district="Ontario" or district="England";
update newcity set population=(select population from city where name="Sao Paulo") where district="England";
set sql_safe_updates=0; -- En 1 evita consultas de update sin where
update newcity set Population=(select Population from city where name="Sao Paulo") where district="England";
update newcity set population=(select population from city where name="Ede" order by population desc limit 1) where name="Cambridge" and district="England";
insert into newcity (id,name,countrycode,district,population) values (default,(select name from city order by population limit 1), (select countrycode from city where name="Cambridge" and district="England"), "Distrito final",(select max(population)div 5 from city));
