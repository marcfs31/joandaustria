@echo off
set /a num=%random% %%100 +1

echo %num%

:0
set /p num2=Intenta adivinar el numero: 
echo %num2%
if %num2% lss %num% goto 1
if %num2% gtr %num% goto 2
if %num2% == %num% goto 3

:1
echo El numero introducido es menor
pause
goto 0

:2
echo El numero introducido es mayor
pause
goto 0

:3
echo Has acertado
pause
 

