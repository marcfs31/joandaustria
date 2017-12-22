#!/usr/bin/env python
# -*- coding: utf-8 -*-
salir ="n"
while(salir!= "s"):
	nombre= raw_input("Introdueix el teu nom: ")
	if(nombre == "fi"):
		break
	num= int(input("Introdueix un numero: "))
	while(num<1):
		print("Número ha d'esser positiu")
		num= int(input("Introdueix un numero: "))
	
	for x in range(0,num):
		print(nombre)
