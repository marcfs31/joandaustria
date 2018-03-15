#!/usr/bin/env python
# -*- coding: utf-8 -*-

def contarDinero(dinero):
	billetes= [0,0,0,0,0,0,0,0,0]
	i=0
	while (dinero >= 500):
		dinero= dinero - 500
		i+=1
		billetes.insert(0, i)
	i=0
	while (dinero >= 200):
		dinero= dinero - 200
		i+=1
		billetes.insert(1, i)
	i=0
	while (dinero >= 100):
		dinero= dinero - 100
		i+=1
		billetes.insert(2, i)
	i=0
	while (dinero >= 50):
		dinero= dinero - 50
		i+=1
		billetes.insert(3, i)
	i=0
	while (dinero >= 20):
		dinero= dinero - 20
		i+=1
		billetes.insert(4, i)
	i=0
	while (dinero >= 10):
		dinero= dinero - 10
		i+=1
		billetes.insert(5, i)
	i=0
	while (dinero >= 5):
		dinero= dinero - 5
		i+=1
		billetes.insert(6, i)
	i=0
	while (dinero >= 2):
		dinero= dinero - 2
		i+=1
		billetes.insert(7, i)
	i=0
	while (dinero >= 1):
		dinero= dinero - 1
		i+=1
		billetes.insert(8, i)
	i=0
	
	return billetes

billetes2=[]
dinero = int(input("Cuanto dinero tienes? "))
billetes2 = contarDinero(dinero)

print(billetes2[0] , " Billetes de 500€")
print(billetes2[1] , " Billetes de 200€")
print(billetes2[2] , " Billetes de 100€")
print(billetes2[3] , " Billetes de 50€")
print(billetes2[4] , " Billetes de 20€")
print(billetes2[5] , " Billetes de 10€")
print(billetes2[6] , " Billetes de 5€")
print(billetes2[7] , " Billetes de 2€")
print(billetes2[8] , " Billetes de 1€")



