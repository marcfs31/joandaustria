-- Problema Integridad Referencial 2
use world;
show create table city;

-- City(_ID_,Name,CountryCode,District,Population,_CountryCode_)
    -- Donde {CountryCode} Referencia a country

show create table country;

-- Country(_Code_,Name,Continent,Region,SurfaceArea,IndepYear,Population,LifeExpectancy,GNP,GNPOld,LocalName,GovernmentForm,HeadOfState,Capital,Code2)

show create table countrylanguage;

-- Countrylanguage(_CountryCode_,Language,IsOfficial,Percentage)
    -- Donde {CountryCode} Referencia a country

drop database if exists coches;
create database coches character set utf8mb4 collate utf8mb4_unicode_ci;
use coches;
create table marca(
    Cifm int(10) auto_increment,
    Nombre char(20) not null,
    Ciudad char(20),
    primary key (Cifm)
) comment 'Tabla marca';

create table coche(
    CodCoche int(10),
    Nombre char(20) not null,
    Modelo char(20),
    Cifm int(10),
    primary key (CodCoche),
    foreign key (Cifm) references marca(Cifm) on update cascade on delete restrict
) comment 'Tabla coche';

create table concesionario(
    Cifc int(10),
    Nombre char(20) not null unique,
    Ciudad char(20),
    primary key (Cifc)
) comment 'Tabla concesionario';

create table cliente(
    DNI char(9),
    Nombre char(20) not null,
    Apellido char(20) not null,
    Ciudad char(20),
    primary key (DNI)
) comment 'Tabla cliente';

create table venta(
    Cifc int(10),
    DNI char(9),
    CodCoche int(10),
    color enum('Azul','Verde','Rojo','SinColor'),
    primary key (Cifc, DNI, CodCoche),
    foreign key (Cifc) references concesionario(Cifc) on update cascade on delete restrict,
    foreign key (DNI) references cliente(DNI) on update cascade on delete restrict,
    foreign key (CodCoche) references coche(CodCoche) on update cascade on delete restrict
) comment 'Tabla venta';
