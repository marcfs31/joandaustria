#!/usr/bin/env python
# -*- coding: utf-8 -*-

file = open("file.txt","r")
file2 = open("file2.txt","w")

while True:
	line=file.readline()
	if(line==""):
		break
	file2.write(line)

file.close()
file2.close()
