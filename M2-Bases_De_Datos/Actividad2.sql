create database if not exists actividad2;
use actividad2;
drop table if exists tabla1;
create table tabla1(
    codigo smallint primary key,
    nombre varchar(30),
    fecha_venta date,
    descripcion varchar(100),
    cantidad int,
    precio decimal(8,2),
    descuento decimal(3,2) default null
    );

insert into tabla1 values(1,'Eladio',20180102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',12,10.20,1.3);
insert into tabla1 values(2,'Carlos',20170102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',34,13.54,4.32);
insert into tabla1 values(3,'Alicia',20160202,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',54,1.2,7.21);
insert into tabla1 values(4,'Pedro',20140302,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',67,1.5,default);
insert into tabla1 values(5,'Ana',20170102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',23,57.32,3.23);
insert into tabla1 values(6,'Caridad',20180102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',98,21.32,3.76);
insert into tabla1 values(7,'Alejandro',20180102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',12,98.01,default);
insert into tabla1 values(8,'Juan',20180102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',24,76.07,default);
insert into tabla1 values(9,'Andrés',20180102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',45,0.07,0.01);
insert into tabla1 values(10,'Dolores',20180102,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore.',31,9.78,1.43);

select char_length(nombre),curdate(),date_format(fecha_venta, '%W') from tabla1;
select cantidad+precio, (cantidad+precio)/5, mod((cantidad+precio),5) from tabla1;
select upper(substring(nombre,2)) from tabla1;
select replace(descripcion,' ','_') from tabla1;
select codigo from tabla1 where isnull(descuento);
set lc_time_names='es_ES'; select date_format(now(),'%d de %M de %Y');

select nombre, cantidad, abs(cantidad), precio, ceil(precio), floor(precio), descuento, truncate(descuento,1) from tabla1;
select nombre, cantidad, abs(cantidad), precio, ceil(precio), floor(precio), descuento, truncate(descuento,1), precio*descuento 'precio final' from tabla1;
select nombre, cantidad, abs(cantidad), precio, ceil(precio), floor(precio), descuento, truncate(descuento,1), round(precio*descuento,2) 'precio final' from tabla1;
select codigo, nombre, descripcion, find_in_set(' ',descripcion), fecha_venta from tabla1;
select codigo, nombre, descripcion, locate(' ',descripcion), year(fecha_venta), concat(precio,'euros') from tabla1;
select codigo, descripcion, replace(descripcion,' ',''), substring(descripcion,locate(' ',descripcion)), fecha_venta+interval 100 day from tabla1;
select codigo, fecha_venta, timestampdiff(day,fecha_venta,now()) from tabla1 order by 3 desc;
select codigo,if(codigo>4,date_format(fecha_venta,'%Y-%M-%d-%a'), date_format(fecha_venta,'%d-%c-%Y')) 'fecha formatada' from tabla1;
select codigo, descripcion from tabla1 order by ifnull(precio*descuento,'a'); -- Pone los nulls al final

use world;
select Name from country where continent='North America' or continent='South America' order by Population desc limit 1;
select Name from country where Name like 'a%';
select Name from country where Capital is null;
select Name from country where Name like '% % %';
select Population,Continent from country where Continent='Europe';
