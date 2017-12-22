@echo off
set /p ruta=Introdueix una ruta absoluta del fitxer a renombrar: 
set /p extensio=Introdueix la extensio: 

rename %ruta% *_test %extensio%