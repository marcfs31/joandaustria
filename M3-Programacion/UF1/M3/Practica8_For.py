#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""*******************************************
* Exercici1. Llista dels 100 primers numeros
*******************************************"""
"""
for num in range(100):
	print num
"""

"""*******************************************
* Exercici3. Llista entre dos numeros
*******************************************"""
"""
num1 = int(input("Introdueix el primer numero: "))
num2 = int(input("Introdueix el segon numero: "))
if num1 > num2:
	escala = -1
	num2 -= 1
else:
	escala = 1
	num2 += 1
for i in range(num1,num2,escala):
	print i
"""

"""*******************************************
* Exercici5. 
*******************************************"""

nom = raw_input("Escriu el teu nom: ");
edat = int(input("Escriu la teva edat: "));
anys = int(input("Quin any es: "));
validacio = True
print ""

while validacio:
	if nom == "":
		nom = raw_input("Siusplau escriu un nom: ");
	elif edat < 0:
		edat = int(input("Escriu be la teva edat: "));
	elif anys < edat:
		anys = int(input("Escriu be l'any: "));
	else:
		validacio=False

print ""

for i in range(edat):
	if i == 0:
		print anys - edat,"va neixer"
	else:
		print anys - (edat - i),"tenia",i,"anys"

print "Adeu",nom


"""*******************************************
* Exercici 6: El factorial d’un nombre sencer 
*******************************************"""
"""
num = int(input("Escriu el nombre del que vols saber el factorial: "))
if num < 0:
	print "El numero no es correcte"
else:
	i = 1
	num += 1
	op = 1
	
	while i < num:
		op=op*i
		if i == num -1:
			print i,"=",
		else:
			print i,"x",
		i+=1
	print op
"""

"""*******************************************
* Exercici 9: Un quadrat de nombres 
*******************************************"""
"""
num = int(input("Escriut un numero enter positiu: "))
num+=1
for n in range(1,num,1):
	for i in range(1,num,1):
		if i == num - 1:
			print i
		else:
			print i,
"""

"""*******************************************
* Exercici 10: Un rectangle de nombres
*******************************************"""
"""
num1 = int(input("Escriut un numero enter positiu: "))
num2 = int(input("Escriut un altre numero enter positiu: "))
num1+=1
num2+=1
for n in range(1,num2,1):
	for i in range(1,num1,1):
		if i == num1 - 1:
			print i
		else:
			print i,
"""

"""*******************************************
* Exercici 11. Un triangle d'asteriscs
*******************************************"""
"""
num = int(input("Escriut un numero enter positiu: "))
num+=1
for n in range(0,num,1):
	for i in range(0,n,1):
		if i == n - 1:
			print "*"
		else:
			print "*",
"""

"""*******************************************
* Exercici 12. Un triangle de nombres
*******************************************"""
"""
num = int(input("Escriut un numero enter positiu: "))
num+=1
for n in range(1,num,1):
	for i in range(n,0,-1):
		if i == 1:
			print i
		else:
			print str(i)+",",
"""

"""*******************************************
* Exercici 13. Un triangle invertit
*******************************************"""
"""
num = int(input("Escriut un numero enter positiu: "))
for n in range(num,0,-1):
	for i in range(n,0,-1):
		if i == 1:
			print i
		else:
			print str(i)+",",
"""

"""*******************************************
* Exercici 14. Triangles
*******************************************"""
"""
num = int(input("Escriut un numero enter positiu: "))
for voltes in range(num):
	x=9
	for n in range(10):
		for i in range(x):
			print "·",
			
		for i in range(x,9,1):
			print i,
		print 9,
		
		for i in range(8,x -1,-1):
			print i,
			
		for i in range(x):
				print "·",
		x-=1
		print ""
"""
