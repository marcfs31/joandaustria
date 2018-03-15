#!/usr/bin/env python
# -*- coding: utf-8 -*-
while True:
	try:
		file_name = input("Name of the file or location --> ")
		file = open(file_name,"r")
		break
	except FileNotFoundError:
		print("ERROR: File not found")

while True:
	try:
		num = int(input("How many lines you wanna see --> "))
		break
	except:
		print("ERROR: Input data type error")

file.seek(0,2) # El 0 es que empieza desde la posicion 0 y el 2 es el final del archivo
cont = 0
while True:
	curr_loc=file.tell()
	line=file.readline()
	if(cont == num or line == ""):
		break
	print(line)
	cont += 1
	file.seek(-2,curr_loc)

file.close()
