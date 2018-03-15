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
	try:
		num1 = int(input("Enter a number: "))
		op = input("Enter the operand (+ - * /)")
		num2 = int(input("Enter a number: "))
		
		if (op=="x"):
			print(mult(num1,num2),yupi)
		
		elif (op=="*"):
			print(mult(num1,num2))
		
		elif (op=="-"):
			print(restar(num1,num2))
		
		elif (op=="/"):
			print(div(num1,num2))
		
		elif (op=="+"):
			print(sumar(num1,num2))
		
		else:
			print("You introduced a wrong operand")
	except NameError:#Peta si pones algo que no sea utf-8 en plan unicode o asi
		print("ERROR: Some variable is not defined")
	except ZeroDivisionError:
		print("ERROR: Division by zero")
	except ValueError:
		print("ERROR: Input data type error")
		
	condition2 = input("You wanna continue y/n ? ")
	if (condition2 == "n"):
		condition = False
