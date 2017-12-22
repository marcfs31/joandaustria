#!/usr/bin/env python
# -*- coding: utf-8 -*-

salir="n"
negativos=0
positivos=0
num2=0
num3=0

while(salir != "s"):
	num = int(input("Introdueix un numero: "))
	if(num == 0):
		salir ="s" #Salir se pasa a s para que la entrada al bucle se deje de cumplir
	elif(num < 0): #Si el numero es negativo
		negativos = negativos+1
		num2 = num2 + num
	elif(num > 0): #Si el numero es positivo
		positivos = positivos+1
		num3 = num3 + num

print("Has introduït",negativos,"números negatius, i el sumatori és",num2)
print("Has introduït",positivos,"números positius, i el sumatori és",num3)
