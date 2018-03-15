-- 1
select SALA_COD, SEXE from SALA join MALALT on INSCRIPCIO=INSCRIPCIO;
select SALA_COD, count(SEXE) from SALA join MALALT on INSCRIPCIO=INSCRIPCIO group by 1;
-- 2
select COGNOM, INSCRIPCIO from MALALT where INSCRIPCIO not in (select INSCRIPCIO from INGRESSOS);
-- 4

-- 5
select NOM from HOSPITAL join DOCTOR using(HOSPITAL_COD) where ESPECIALITAT="Cardiologia";
-- 6
-- 8
select HOSPITAL_COD,sum(QTAT_LLITS) from SALA group by 1;
-- 9
update HOSPITAL set QTAT_LLITS=(select sum(QTAT_LLITS) from SALA);
-- 10
update INGRESSOS SET SALA_COD = 2, HOSPITAL_COD = 22 where INSCRIPCIO = (select INSCRIPCIO from MALALT where COGNOM="Serrano V.");
