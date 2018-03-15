#!/usr/bin/env python
# -*- coding: utf-8 -*-
def triangulo(num):
	for i in range(num):
		for x in range(i+1,0,-1):
			print(str(x)+", ",end="")
		print()

num = int(input("Escribe un numero: "))
triangulo(num)
