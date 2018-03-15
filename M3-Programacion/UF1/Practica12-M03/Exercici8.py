#!/usr/bin/env python
# -*- coding: utf-8 -*-

#Coger alumnos
alumnos = int(input("Número de alumnos: "))
while (alumnos > 50 or alumnos < 1):
	alumnos = int(input("Número de alumnos invalido: "))
notas = []
#Coger notas
for x in range(0,alumnos,1):
	nota = int(input("Nota "))
	while (nota < 0 or nota >10):
		nota = int(input("Nota invalida "))

	notas.append(nota)

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
 
#Añadir nota
add = input("Quieres añadir alguna nota s/n ?")
if (add == "s"):
	posicion = int(input("Posición a añadir: "))
	while (posicion > alumnos-1 or posicion < 0):
		posicion = int(input("Error posición a añadir: "))
	
	nota = int(input("Nota "))
	while (nota < 0 or nota >10):
		nota = int(input("Nota invalida "))
	notas2 = []
	notas2 = notas
	notas2.insert(posicion, nota)

	#Media
	for x in range(0,alumnos,1):
		media = media + notas[x]
	
	print("Media ",media/alumnos)
	
	#Nota minima
	print("Nota mínima ",min(notas))
	
	#Nota maxima
	print("Nota máxima ",max(notas))
	
	print("Correció : ",end="")
	for x in range(0,alumnos,1):
		print(notas[x],",", end="")
