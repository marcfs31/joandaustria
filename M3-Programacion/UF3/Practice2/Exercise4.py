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
	line=file.readline()
	if(line==""):
		break
	print(line)

file.close()
