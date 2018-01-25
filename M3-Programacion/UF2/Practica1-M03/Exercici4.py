#!/usr/bin/env python
# -*- coding: utf-8 -*-

def segons1(num):
	hores=(int(num/3600))
	minuts=int((num-(hores*3600))/60)
	segons=num-((hores*3600)+(minuts*60))
	#print(str(hores)+"h "+str(minuts)+"m "+str(segons)+"s")
	return hores, minuts, segons

def segons2(hores, minuts, segons):
	num=(int(hores*3600))
	num=num+int(minuts*60)
	num=num+int(segons)
	#print(str(num)+"s")
	return num

print("Que vols fer: ")
print("1- Segons a hores minuts i segons")
print("2- Hores minuts i segons a segons")
op = int(input())

if(op == 1):
	num = int(input("Escriu els segons: "))
	x,y,z=segons1(num)
	print(str(x)+"h "+str(y)+"m "+str(z)+"s")

else:
	hores = int(input("Escriu les hores: "))
	minuts = int(input("Escriu els minuts: "))
	segons = int(input("Escriu els segons: "))
	x=segons2(hores,minuts,segons)
	print(str(x)+"s")
