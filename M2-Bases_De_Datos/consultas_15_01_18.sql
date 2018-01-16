use world;
-- 15/1/2018
select sum(Population) from country; -- Sumar la poblacion mundial
select name,char_length(name) - char_length(replace(name,' ','')) sin from country order by 2 desc limit 10; -- Ordenar los paises por espacios
select name from country where continent='europe' order by surfaceArea limit 1; -- Pais más pequeño de europa
select count(name) from country where continent='asia'; -- Contar paises de asia
