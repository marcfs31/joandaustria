use ddl;
drop TABLE IF EXISTS VISITA_WEB;
CREATE TABLE VISITA_WEB (IdentificadorGrupoUsuarios INT(10) Unsigned NOT NULL default '99999999' ,IdentificadorUsuario INT(10) unsigned NOT NULL default '99999999', FechaDeLaVisita TimeStamp NOT NULL default CURRENT_TIMESTAMP, DuracionVisita Time default '00:00:00' comment 'Comentario en fila', Intereses SET('Seguridad','SO','Apps','Ofimática','Web','MVs','Otros') NOT NULL default 'Otros', primary key (`IdentificadorGrupoUsuarios`,`IdentificadorUsuario`));
insert into VISITA_WEB values (1,2,19990331,'15:08:30',default);
