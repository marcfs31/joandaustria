#!/usr/bin/env python
# -*- coding: utf-8 -*-

file_name = "file.txt"
wordList = []

#Read lines into a list
file = open(file_name, 'r')
for line in file:
	for word in line.split():
		wordList.append(word)

for x in range(len(wordList)):
	print(wordList[x])
