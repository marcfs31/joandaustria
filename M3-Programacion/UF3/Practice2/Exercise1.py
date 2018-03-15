#!/usr/bin/env python
# -*- coding: utf-8 -*-

file = open("file.txt")

num = int(input("Pon el numero de palabras que quieres"))

print("PRIMERA MANERA")

for i in range(num):
	line=file.readline()
	print(line)
file.close()

file = open("file.txt")
cont = 0

print("SEGUNDA MANERA")

for i in file:
	if(cont == num):
		break
	print(i)
	cont+=1

file.close()
