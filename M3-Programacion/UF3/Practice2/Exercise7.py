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

cont = 0
while True:
	line=file.readline()
	if(cont == num or line == ""):
		break
	print(line)
	cont += 1

file.close()
