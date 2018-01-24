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

hores = int(input("Escriu les hores: "))
minuts = int(input("Escriu els minuts: "))
segons = int(input("Escriu els segons: "))

hores_1 = int(input("Escriu les hores: "))
minuts_1 = int(input("Escriu els minuts: "))
segons_1 = int(input("Escriu els segons: "))

x=segons2(hores,minuts,segons)
y=segons2(hores_1,minuts_1,segons_1)

num=x+y
a,b,c=segons1(num)
print(str(a)+"h "+str(b)+"m "+str(c)+"s")
