#!/usr/bin/env python
# -*- coding: utf-8 -*-

def sumarCuentaRegresiva(num1, num2):
	if (num1 == num2):
		return num1

	if (num1 > num2):
		n = num2 + sumarCuentaRegresiva(num1, num2+1)
		return n

	if (num1 < num2):
		n = num2 + sumarCuentaRegresiva(num1+1, num2)
		return n
	return 0

num1 = int(input("Primer número: "))
num2 = int(input("Segundo número: "))

print(sumarCuentaRegresiva(num1,num2))
