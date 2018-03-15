#!/usr/bin/env python
# -*- coding: utf-8 -*-

def capitalize(cadena):
	"""
	Retorna la cadena amb la primera lletra en majuscules
	>>> capitalize('marc fors')
	'Marc Fors'
	"""
	cont = 0
	cadena = cadena.lower()
	cadena2=""
	
	for i in range(0,len(cadena),1):
		if (i == 0):
			cadena2 = cadena2+cadena[0].upper()
		elif (cadena[i-1] == " "):
			cadena2 = cadena2+cadena[i].upper()
		else:
			cadena2 = cadena2+cadena[i]

	return cadena2

#cadena.title()

cadena = input("Como te llamas? ")
print(capitalize(cadena))
