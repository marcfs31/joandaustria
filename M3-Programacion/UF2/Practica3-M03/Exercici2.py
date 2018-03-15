#!/usr/bin/env python
# -*- coding: utf-8 -*-

#Coger alumnos
alumnos = int(input("Número de alumnos: "))
while (alumnos > 50 or alumnos < 1):
	alumnos = int(input("Número de alumnos invalido: "))

#Coger notas

for x in range(0,alumnos,1):
	nota = int(input("Nota "))
	while (nota < 0 or nota >10):
		nota = int(input("Nota invalida "))

	if (x == 0):
		notas = [nota]
	else:
		notas.insert(x,nota)


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
