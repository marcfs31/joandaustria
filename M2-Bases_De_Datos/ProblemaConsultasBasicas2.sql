use world;
select CountryCode,Language from countrylanguage where Language='Swedish' order by CountryCode DESC;
select Name from city order by Name ASC limit 10;
select CountryCode,Language from countrylanguage where Language='Chinese' order by CountryCode DESC  limit 2;
select * from country where GNP>GNPOld order by Name limit 3;
