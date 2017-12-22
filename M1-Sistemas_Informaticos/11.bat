@echo off
set /p ruta1=Introdueix una ruta absoluta del fitxer a copiar: 
set /p ruta2=Introdueix la ruta absoluta a on copiar-lo: 

copy %ruta1% %ruta2%