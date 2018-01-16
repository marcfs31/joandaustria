#!/usr/bin/env python
# -*- coding: utf-8 -*-

num = int(input("Introduce un valor y te dire si es primo o no: "))
n = 2
acaba = 0
validacio = True
while num > acaba:
	prim = 0
	for i in range(1,n,1):
		if n % i == 0:
			prim += 1
		if prim > 2:
			break
	if prim < 3:
		print(n)
		acaba += 1	
	n+=1

