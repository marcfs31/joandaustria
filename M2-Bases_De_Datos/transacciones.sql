-- Piensa una situación (como la de la transacción bancaria) en la que sea necesario utilizar alguna transacción.
-- Paypal,
-- Realiza una consulta al diccionario de datos para averiguar qué motores de almacenamiento admiten transacciones.
show engines; -- InnoDB lo permite
-- ¿Qué dice el manual sobre las transacciones? Échale una ojeada.

-- Comprueba que la tabla City admite transacciones.
show create table city;
-- Empieza una transacción.
start transaction;
-- Elimina una fila de la tabla City.
delete from city where ID=4079;
-- Deshaz el cambio. ¿Qué sucede?
rollback; -- Se sale de la transacción y vuelve a estar todo como antes
-- Inicia una nueva transacción y vuelve a eliminar una fila de City
start transaction;
delete from city where ID=4079;
-- Compromete los cambios y comprueba que efectivamente ha desaparecido la fila, ¿puedes deshacer los cambios?
commit;
select * from city order by 1 desc limit 10;
-- No se pueden deshacer
