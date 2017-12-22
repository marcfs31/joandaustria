#####
MySql
#####

Instalación
###########

apt-get install mysql-server mysql-client


Acceder al cliente de mysql
###########################

mysql -u root -paustria Con esto le pasas la contraseña despues de la p
mysql -u root -p Te pedirá la contraseña aqui

Comandos
########

; Manda al servidor lo que tenga delante

help o \\h Ayuda

exit o quit Salir

show databases; Muestra las bases de datos

help show databases; Muestra ayuda de un comando

CREATE DATABASE primeraPrueba; Crear base de datos

CREATE TABLE primeraPrueba.primeraTabla (primerAtributo int primary key,segundoAtributo varchar(10)); Añadir atributos a la tabla y crear tabla en la base de datos creada antes

show tables from primeraPrueba; Muestra las tablas de la base de datos

insert into primeraPrueba.primeraTabla values (457,'iiiiiii'),(78,'jjjj'); Insertar datos en la tabla en el primerAtributo le ponemos un entero y en el segundo un string tal como antesse definió

select * from primeraPrueba.primeraTabla; Ver todos los valores de la tabla

use primeraPrueba Le dices al cliente que trabajarás en esa base de datos

drop Table NombreTabla Eliminar tabla

show create table ProblemTiposTabla; Muestra como se ha creado la tabla

describe ProblemaTiposTabla; Muestra toda la info de la tabla
desc hace lo mismo

insert into ProblemaTiposTabla values (200,200-200),(5,0,3804); Inserta dos filas

show variables like 'time%'; Ver zona horaria

set time_zone='+10:00'; cambiar zona horaria a una con +10 horas se puede poner 'system'

El TimeStamp se actualiza cuando haces un update de un tipo de datos

mysql -u root -paustria < /home/marc/world.sql/world.sql Importar una base de datos

Puedes crear un archivo .sql con las intrucciones y con \. instrucciones.sql y se ejecutaran en el MySql

\\! ls Permite ejecutar comandos del sistema incluso el vim.
Tipos de datos

charset indica que conjunto de caracteres puedo usar y el orden del alfabeto a usar
collation establece el conjunto de normas asociadas a un alfabeto. Puede haber varios.

show charset;

show collation;

show create table Problema1; muestra como se creó la tabla

select last_insert_id(); Muestra el ultimo valor puesto

Tipos de datos
##############

Enteros
=======

TINYINT (1Byte) Signed(-128/127) Unsigned(0/255)

SMALLINT (2Bytes) Signed(-32768/32767) Unsigned(0/65535)

MEDIUMINT (3Bytes) Signed(-8388608/8388607) Unsigned(0/16777215)

INT (4Bytes) Signed(-2147483648/2147483648) Unsigned(0/4294967295)

BIGINT (8Bytes) Signed(-9223372036854775808/9223372036854775807) Unsigned(0/18446744073709551615)


Texto
=====

varchar(10) - Como un string pero de 10 de longitud este es de longitud variable de Bytes

char(10) - Como el varchar pero es fijo lo que ocupa en Bytes

En coma flotante
================

float(longitud_max,decimales) - Se usa para valores aproximados el primer campo es la longitud total del numero y los demaciales es que parte de esa longitud son decimales

Los floats pueden ser unsigned y zerofill también.

También hay double que es como el float pero más grande.

Con punto fijo
==============

decimal(longitud_max,decimales) también puede ser zerofill y unsigned , el decimal se usa para numeros exactos

Bits
====

bit(longitud_max) Para poner bits(1,0)

Fechas y horas
==============

Time
====

nombre_fila time

'HH:MM:SS'

Usa 3 Bytes

Rango (-838:59:59 a 838:59:59)

Year
====

nombre_fila year

'1999'

Date
====

date
'9999-12-31'

DateTime
========

datetime
'9999-12-31 23:59:59'

TimeStamp
=========

timestamp

default

Texto
=====

Char
====

char (longitud fija)

máximo de 255

VarChar
=======

varchar (longitud_max)

Text
====

TINYTEXT (máxima longitud 255 bytes)

TEXT (65535 bytes)

MEDIUMTEXT (16777215 bytes)

LONGTEXT (4*10^9 bytes)

Enum
====

Es una lista que el valor siempre sera uno de los elementos definidos en la lista

enum('Elemento1','Elemento2')

Set
===

Es como el enum pero en el set puedes escojer los que quieras.

set('Elemento1','Elemento2') Aqui defines 2 elementos que luego puedes cojer

Tipos binarios
==============

Se usan para guardar fotos pro ejemplo y lo hace binario.

BINARY: de longitud fija

VARBINARY: de longitud variable

TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB

El blob seria para fotos

Null
====

No es un tipo de dato es un valor especial que significa ausencia de valor.

se pone null


Ejercicio1
##########

create table ProblemaTiposTabla (Campo1 smallint unsigned, Campo2 smallint unsigned zerofill, Campo3 mediumint);

insert into ProblemaTiposTabla values (30000,50000,300000);

select * from ProblemaTiposTabla;

Ejercicio2
##########

create table ProblemaTiposTabla2 (Campo1 float(10,5), Campo2 decimal(10,5), Campo3 boolean, Campo4 bit(20)); Crear la tabla

insert into ProblemaTiposTabla2 values (10.56,30.6,true,1); Insertar los datos el último es binario si solo poner 1 numero esta bien sino es b'100101'

insert into ProblemaTiposTabla2 values (10323.5632,3088.126,false,'b1010101001'); Poner

select * from ProblemaTiposTabla2; Mostrar la tabla

select bin(Campo4) from ProblemaTiposTabla2; Te muestra los binarios en binario sino salen en ASCII.

select obt(Campo4) from ProblemaTiposTabla2; Te lo muestra en octal

Ejercicio3
##########

create table ProblemaTipos3 (Tiempo time, Año year, Fecha date, FechaTiempo datetime, TiempoEstampado timestamp);

insert into ProblemaTipos3 values ('666:33:22','1999','1999-3-31','1999-3-31 17:55:00',default);

select * from ProblemaTipos3;

show variables like 'time%'; Ver zona horaria

set time_zpne='+10:00'; cambiar zona horaria a una con +10 horas

Ejercicio4
##########

create table Tipos4 (Campo1 char(20),Campo2 varchar(20),Campo3 text,Campo4 enum('1','2','3','4'),Campo5 set('1','2') );

describe Tipos4;

insert into Tipos4 values ('marc','marc fors','marc fors soler','1','1,2');

insert into Tipos4 values ('marc','marc fors','marc fors soler','2','1,2');

Ejercicio5
##########

create table Tipos5 (Campo1 varchar(20) character set utf8, Campo2 varchar(20) charset big5);

insert into Tipos5 values ('привет',' 你好';

insert into Tipos5 values ('♨','hola');

select * from Tipos5;

insert into Tipos5 values ('☢','S');

Consultas
#########

si haces un fail pones \\c para cancelar
si haces \\G te muestra la columna como filas

select distinct continent from country; Elimina duplicados en la columna continent de la tabla country
