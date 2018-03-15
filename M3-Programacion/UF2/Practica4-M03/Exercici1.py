#!/usr/bin/env python
# -*- coding: utf-8 -*-

def sumarCuentaRegresiva(n):
	if ( n == 0):
		return 0
	else:
		return n + sumarCuentaRegresiva(n-1)

num = int(input("Primer número: "))

print(sumarCuentaRegresiva(num))
