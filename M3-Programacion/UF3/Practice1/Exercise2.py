#!/usr/bin/env python
# -*- coding: utf-8 -*-

#Coger alumnos
try:
	alumnos = int(input("Número de alumnos: "))
	while (alumnos > 50 or alumnos < 1):
		alumnos = int(input("Número de alumnos invalido: "))
except NameError:#Peta si pones algo que no sea utf-8 en plan unicode o asi
		print("ERROR: Some variable is not defined")
except ZeroDivisionError:
	print("ERROR: Division by zero")
except ValueError:
	print("ERROR: Input data type error")
except IndexError:
	print("ERROR: List position error")

#Coger notas
try:
	for x in range(0,alumnos,1):
		nota = int(input("Nota "))
		while (nota < 0 or nota >10):
			nota = int(input("Nota invalida "))
	
		if (x == 0):
			notas = [nota]
		else:
			notas.insert(x,nota)
except NameError:#Peta si pones algo que no sea utf-8 en plan unicode o asi
		print("ERROR: Some variable is not defined")
except ZeroDivisionError:
	print("ERROR: Division by zero")
except ValueError:
	print("ERROR: Input data type error")

try:
	#Media
	media = 0
	for x in range(0,alumnos,1):
		media = media + notas[x]
	
	print("Media ",media/alumnos)
	
	#Nota minima
	print("Nota mínima ",min(notas))
	
	#Nota maxima
	print("Nota máxima ",max(notas))
	
	#Imprimir notas
	print("Inicial : ",end="")
	for x in range(0,alumnos,1):
		print(notas[x],",", end="")
	
	print("")
except NameError:#Peta si pones algo que no sea utf-8 en plan unicode o asi
		print("ERROR: Some variable is not defined")

try:
	#Corregir nota
	cambiar = input("Quieres cambiar alguna nota s/n ?")
	if (cambiar == "s"):
		posicion = int(input("Posición a cambiar"))
		while (posicion > alumnos-1 or posicion < 0):
			posicion = int(input("Error posición a cambiar"))
		
		nota = int(input("Nota "))
		while (nota < 0 or nota >10):
			nota = int(input("Nota invalida "))
			
		notaEliminar = notas[posicion]
		notas.remove(notaEliminar)
		notas.insert(posicion, nota)
except NameError:#Peta si pones algo que no sea utf-8 en plan unicode o asi
		print("ERROR: Some variable is not defined")
except ZeroDivisionError:
	print("ERROR: Division by zero")
except ValueError:
	print("ERROR: Input data type error")
except IndexError:
	print("ERROR: List position error")

try:
	#Media
	media = 0
	for x in range(0,alumnos,1):
		media = media + notas[x]
	
	print("Media ",media/alumnos)
	
	#Nota minima
	print("Nota mínima ",min(notas))
	
	#Nota maxima
	print("Nota máxima ",max(notas))
	
	#Imprimir notas
	print("Correcció : ",end="")
	for x in range(0,alumnos,1):
		print(notas[x],",", end="")
except NameError:#Peta si pones algo que no sea utf-8 en plan unicode o asi
		print("ERROR: Some variable is not defined")
