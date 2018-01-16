use world;

-- Funciones de agregación

select sum(Population), group_concat(Name) from country where Continent='Europe';

-- Problema agregación 1
select min(Population) from country;
select sum(Population) from country where Continent='Africa';
select avg(Population) 'Media' from country where Continent='North America';
select group_concat(Name separator ' ') from country where Continent='Asia'; -- Para especificar el separador poner separator
select group_concat(Name order by Name separator ' ') from country where Continent='Asia';


-- Problema de agregación 2
select max(Population), Continent from country group by Continent;
-- select Name, max(Population) from country group by Continent; -- No va ya que mezclas valores agregados a los no agregados
select avg(lifeexpectancy), Continent from country group by Continent order by 1 desc;
select min(Population),Continent from country group by Continent order by 1 asc limit 1; -- Muestra el pais con menos poblacion de cada continente
select max(Population),region from country where Continent='Europe' group by region order by 1 desc limit 1 ; -- Me devuelve la máxima poblacion de un pais de cada region
select group_concat(Name),governmentform from country where Continent='south america' group by 2;
select count(governmentform),governmentform from country group by 2 order by 1 desc limit 5;

-- Consultas random

select count(Language),Language from countrylanguage group by 2 order by 1 desc limit 1;
select count(distinct Language) 'Idiomas en todo el mundo' from countrylanguage;
select count(Language) 'Paises donde se habla ruso' from countrylanguage where Language="Russian";
select avg(lifeexpectancy),region from country group by region order by 1 desc limit 1 ;
select count(ID),countryCode from city group by 2 order by 1 desc limit 1;
select sum(Population) from city;
select max(Population),countryCode from city group by 2 order by 1 desc limit 1; -- Ciudad más poblada
