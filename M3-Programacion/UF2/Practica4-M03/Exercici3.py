#!/usr/bin/env python
# -*- coding: utf-8 -*-

def factorial(n):
	if (n == 0):
		return 1
	else:
		return n*(factorial(n-1))

num = int(input("Primer número: "))

print(factorial(num))
