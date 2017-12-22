@echo off
set /p ruta=Introdueix una ruta absoluta per llistar: 
set /p tipo=Introdueix si vols tree o dir: 

if %tipo% == tree goto 1
if %tipo% == dir goto 2
else goto 3

:1
tree %ruta% >> D:\Desktop\hola.txt
pause
exit

:2
dir %ruta% >> D:\Desktop\hola.txt
pause
exit

:3
echo Opció incorrecta.