#!/usr/bin/env python
# -*- coding: utf-8 -*-
def triangle():
	x=9
	for n in range(10):
		for i in range(x):
			print("·", end="")
			
		for i in range(x,9,1):
			print(i, end="")
		print(9, end="")
		
		for i in range(8,x -1,-1):
			print(i, end="")
			
		for i in range(x):
			print("·", end="")
		x-=1
		print("")

num = int(input("Escribe un numero: "))
for i in range(num):
	triangle()
