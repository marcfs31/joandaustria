#!/usr/bin/env python
# -*- coding: utf-8 -*-
def cuadrado(num):
	for i in range(num):
		for x in range(1,num+1):
			print(str(x)+" ",end="")
		print()

num = int(input("Escribe un numero: "))
cuadrado(num)
