#!/usr/bin/env python
# -*- coding: utf-8 -*-

def producto(a,b,c,d):
	return max([a*b,a*c,a*b,b*c,b*d,c*d])

num1 = int(input("Numero 1: "))
num2 = int(input("Numero 2: "))
num3 = int(input("Numero 3: "))
num4 = int(input("Numero 4: "))

print(producto(num1,num2,num3,num4))
