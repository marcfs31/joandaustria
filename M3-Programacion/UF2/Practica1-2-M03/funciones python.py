#!/usr/bin/env python
# -*- coding: utf-8 -*-

def suma(*num): #para no escribir todos los param se puede poner *
	s=0
	for i in num:
		s=s+i
	
	return s,s>=0 #s devuleve el resultado y s>=0 returna true o false si es positivo o negativo

x=1
a,b=suma(x,-3) #doble asignación
print(a, b)
a,b=suma(1,1,2,3,1,4,3,2)
print(a, b)
