#!/usr/bin/env python
# -*- coding: utf-8 -*-
while True:
	try:
		file = input("Location for the file to copy --> ")
		file = open(file,"r") #rb+ Lectura de binarios y el + es para añadir escritura y w+ lectura y escritura
		break
	except FileNotFoundError:
		print("ERROR: File not found")

while True:
	try:
		file2 = input("Location and extension for the copied file --> ")
		file2 = open(file2,"w")
		break
	except FileNotFoundError:
		print("ERROR: File not found")

while True:
	line=file.readline()
	if(line == ""):
		break
	file2.write(line)

file.close()
file2.close()
