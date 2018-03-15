#!/usr/bin/env python
# -*- coding: utf-8 -*-

def sumar(num1, num2):
	return num1+num2

def restar(num1, num2):
	return num1-num2

def div(num1, num2):
	return num1/num2

def mult(num1, num2):
	return num1*num2

condition = True
while condition:
	num1 = int(input("Pon un número: "))
	op = input("Pon un operador (+ - * /)")
	num2 = int(input("Pon un número: "))
	
	if (op=="x"):
		print(mult(num1,num2))
	
	elif (op=="*"):
		print(mult(num1,num2))
	
	elif (op=="-"):
		print(restar(num1,num2))
	
	elif (op=="/"):
		if (num2==0):
			print("Error división entre zero")
		else:
			print(div(num1,num2))
	
	elif (op=="+"):
		print(sumar(num1,num2))
	
	else:
		print("Error al introducir los datos")
		
	condition2 = input("Quieres continuar s/n ? ")
	if (condition2 == "n"):
		condition = False
