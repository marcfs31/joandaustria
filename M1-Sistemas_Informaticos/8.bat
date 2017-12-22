@echo off
set /p ruta=Introdueix una ruta absoluta per llistar: 
dir %ruta% >> D:\Desktop\hola.txt
pause