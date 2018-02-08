use world;
select count(Language),Language from countrylanguage group by 2 order by 1 desc limit 5;
select CountryCode,count(Language),group_concat(language) from countrylanguage where language like '%a%' group by 1 order by 2 desc limit 10;
select count(distinct Language) from countrylanguage;
select count(Language) from countrylanguage where IsOfficial="T" and language="Arabic";
select count(distinct countryCode) from countrylanguage where percentage>90 and language="Spanish";
select language,count(language) from countrylanguage where IsOfficial="F" and percentage>50 group by 1 order by 2 desc limit 5;
select char_length(language),group_concat(language) from countrylanguage group by 1 order by 1 desc limit 3;
