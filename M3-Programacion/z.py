#!/usr/bin/env python
# -*- coding: utf-8 -*-
num = int(input("Introdueix un enter: "))

n = ""
if(num < 4):
	print("ERROR entrada ha d'esser major o igual a 4'")

for x in range(num):
	for y in range(num):
		if(x == y or x == 0 or x == num-1):
			n += "*"
		else:
			n += " "
	print(n)
	n = ""
