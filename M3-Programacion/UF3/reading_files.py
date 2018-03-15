#!/usr/bin/env python
# -*- coding: utf-8 -*-

file = open("/home/marc/file.txt")

while True:
	file_string = file.readline()
	print(file_string)
	if file_string == "":
		break

file.close()
