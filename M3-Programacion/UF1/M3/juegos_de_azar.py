#!/usr/bin/env python
# -*- coding: utf-8 -*-
import random
"""
	Juegos de azar
	Por Óscar García (DAM1_A)
"""
#S'inicia el joc
print("###############################\n#	Juegos de azar	      #\n###############################")
juego = ""

while juego != "s": #Si el valor de juego es "s", s'acabara el bucle i el joc
	#Preguntem quin joc volen jugar
	juego = raw_input("Quieres jugar a:\nTirar los dados (1)\nTirar la moneda (2)\nTreu una carta (3)\nEscriva el numero para elejir el juego o 's' para salir: ")	
	if juego == "1": #El joc de tirar els Daus
		caras = int(input("Cuantas caras quieres que tenga (de 4 a 20): "))
		dados = int(input("Cuantos dados quires usar?(de 1 a 5): "))		
		while juego != "m" and juego != "s": # "m" per sortir del bucle, "s" per sortir de tots els while		
			for i in range(dados):
				print random.randint(1,caras),
			print ""
			juego = raw_input("Intro para volver a tirar, 'm' para escoger otro juego, 's' para salir: ")
	elif juego == "2": #El joc de tirar la moneda
		moneda = ["ツ","✘"]
		juego = raw_input("Intro para tirar, 'm' para escoger otro juego, 's' para salir: ")		
		while juego != "m" and juego != "s": # "m" per sortir del bucle, "s" per sortir de tots els while
			rnd = random.randint(0,1)
			if rnd == 0:
				print "    *  "
				print " *     *"
				print "*   "+moneda[rnd]+"  *"
				print " *     *"
				print "    *   "
			else:
				print "    *  "
				print " *     *"
				print "*   "+moneda[rnd]+"   *"
				print " *     *"
				print "    *   "
			juego = raw_input("Intro para volver a tirar, 'm' para escoger otro juego, 's' para salir: ")			
	elif juego == "3":
		palo = ["♥", "♦", "♠", "♣"]
		numero = ["A","2","3","4","5","6","7","8","9","10","J","Q","K"]
		rnd1 = random.randint(0,3)
		rnd2 = random.randint(0,12)
		if rnd2 == 9:
			print " ________ "
			print "|"+numero[rnd2]+"      |"
			print "|        |"
			print "|        |"
			print "|   "+palo[rnd1]+"    |"
			print "|        |"
			print "|        |"
			print "|______"+numero[rnd2]+"|"
		else:
			print " ________ "
			print "|"+numero[rnd2]+"       |"
			print "|        |"
			print "|        |"
			print "|   "+palo[rnd1]+"    |"
			print "|        |"
			print "|        |"
			print "|_______"+numero[rnd2]+"|"
	elif juego == "s":
		print "Adios"
	else:
		print "Porfavor introduzca un valor correcto"
print "Gracias por jugar"
