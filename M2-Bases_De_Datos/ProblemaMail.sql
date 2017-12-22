use ddl;
drop TABLE IF EXISTS JUGADOR;
CREATE TABLE JUGADOR (IDJugador INT Unsigned AUTO_INCREMENT primary key,
NombreJugador Char(20) charset utf32 NOT NULL default 'nombre_por_defecto',
AliasJugador Char(20) charset latin1 unique ,
FechaNacimiento Date default null ,
FechaIncorporacion TimeStamp default CURRENT_TIMESTAMP ,
Sueldo decimal(10,2) Unsigned NOT NULL default '0.00' ,
PosicionesJugador SET('Portero','Defensa','Medio','MediaPunta','Punta','LateralIzquierdo','LateralDerecho') ,
TiempoJugado time default '00:00:00' );
insert into JUGADOR values (default,'Marc Fors','Markus',19990331,default,9000.99,('Medio'),'60:34:20');
