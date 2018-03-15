#!/usr/bin/env python
# -*- coding: utf-8 -*-

file_name = "file.txt"
wordsCount = 0
a=0

#Read lines into a list
file = open(file_name, 'r')
for line in file:
	for word in line.split():
		wordsCount += 1
		
	a += 1
	print("Line",a,"-",wordsCount,"words")
	wordsCount = 0
