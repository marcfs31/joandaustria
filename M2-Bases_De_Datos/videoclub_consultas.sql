use videoclub;
select FACTURA.Data, FACTURA.Import, CLIENT.Nom, CLIENT.Telefon from FACTURA inner join CLIENT using (DNI);
select sum(import) from FACTURA where Data="2009-03-06";
select DETALLFACTURA.Descripcio, FACTURA.DNI from DETALLFACTURA inner join FACTURA using (CodiFactura) where FACTURA.DNI="022222222R";
select CLIENT.Nom, PELICULA.titol from CLIENT join PRESTEC using (DNI) join PELICULA using (codipeli);
select count(DNI),Nom from PRESTEC join CLIENT using (DNI) group by 2;
select Nom, group_concat(Titol) from PELICULA join ACTOR using (CodiActor) group by 1;
select PELICULA.Titol, GENERE.Descripcio from PELICULA inner join GENERE using (CodiGenere) where GENERE.Descripcio="Terror";
select P1.Titol, P2.Titol from PELICULA P1 inner join PELICULA P2 on P1.segonapart=P2.CodiPeli;
select Titol, count(CodiCopia) from PELICULA join COPIA using (CodiPeli) group by 1;
select group_concat(import), data from FACTURA group by 2 order by 2 desc;
-- Natural join une solo los campos iguales entre las dos tablas
