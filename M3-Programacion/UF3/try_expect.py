#!/usr/bin/env python
# -*- coding: utf-8 -*-

def intValid():
	while True:
		try:
			print("Enter a number --> ")
			num = int(input(""))
			break
		except ValueError:
			print("Error, please enter a valid number")
	return num

print(intValid())
