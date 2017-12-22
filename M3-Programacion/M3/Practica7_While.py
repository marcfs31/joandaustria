# coding: utf-8

"""*******************************************
* Calcular l'arrel d'un numero amb validacio
*******************************************"""
"""
import math

print "Calcularem l'arrel cuadrada"
num = float(input("Introdueix el numero: "))
while num < 0:
		print "El numero es negatiu i no es pot calcular\nIntentau un altre cop"
		num = float(input("Introdueix el numero: "))

print "L'arrel es",math.sqrt(num)
"""
"""*******************************************
* Calculadora d'equacions de segon grau amb validacio
*******************************************"""
"""
import math
print "Tenim l'equació de segon grau ax² + bx + c = 0\nIntrodueix els valors de a, b i c per resoldrela"
a = int(input("Valor de a: "))
b = int(input("Valor de b: "))
c = int(input("Valor de c: "))
inarrel = (b ** 2) - (4 * a * c)

while inarrel < 0:
	print "L'interior de l'arrel dona", inarrel,"i no es pot resoldre l'equació\n"
	a = int(input("Valor de a: "))
	b = int(input("Valor de b: "))
	c = int(input("Valor de c: "))
	inarrel = (b ** 2) - (4 * a * c)
	
arrel = math.sqrt(inarrel)
print str(b)+"² - 4·"+str(a)+"·"+str(c)+" =",inarrel,"\n"
op1 = -b + arrel
print "-("+str(b)+") +"+str(inarrel)+" =",op1
op2 = -b - arrel
x1 = op1 / (2 * a)
x2 = op2 / (2 * a)
print str(op1)+"/2·"+str(a)+" =",x1
print "x1 =",x1
print "\n-("+str(b)+") -"+str(inarrel)+" =",op2
print str(op2)+"/2·"+str(a)+" =",x2
print "x2 =",x2
"""

"""*******************************************
* Suma un segon a la data especificada amb validacio
*******************************************"""
"""
dia = int(input("Introdueix el Dia (DD): "))
mes = int(input("Introdueix el Mes (MM): "))
Any = int(input("Introdueix l'Any (AAAA): "))
hora = int(input("Introdueix l'Hora (HH): "))
minut = int(input("Introdueix els Minuts (MnMn): "))
segon = int(input("Introdueix els Segons (SS): "))

# Comprovacio d'errors, que els valors introduits siguin correctes
validacio = True
while validacio == True:
	if dia > 30 or dia < 1:# <------ Dia
		print "\n<<<No has introdiut be el Dia!>>>\n"
		dia = int(input("Introdueix el Dia (DD): "))
	elif mes > 12 or mes < 1:# <------ Mes
		print "\n<<<No has introdiut be el Mes!>>>\n"
		mes = int(input("Introdueix el Mes (MM): "))
	elif hora > 23 or hora < 0:# <------ Hora
		print "\n<<<No has introdiut be l’Hora!>>>\n"
		hora = int(input("Introdueix l'Hora (HH): "))
	elif minut > 59 or minut < 0:# <------ Minut
		print "\n<<<No has introdiut be els Minuts!>>>\n"	
		minut = int(input("Introdueix els Minuts (MnMn): "))						      
	elif segon > 59 or segon < 0:# <------ Segon
		print "\n<<<No has introdiut be els Segons>>>\n"	
		segon = int(input("Introdueix els Segons (SS): "))				  
	else:
		validacio = False

espacio1 = 0
while espacio1 < 22:
	espacio1 += 1
	print""
		
# Si tot es correcte es procedeix a fer el calcul
if int(segon) + 1 == 60:# <------ Segon
	segon = "0"
	minut = minut + 1
	if minut == 60:# <------ Minut
		minut = "0"
		hora = hora + 1
		if hora == 24:# <------ Hora
			hora = "0"
			dia = dia + 1
			if dia == 31:# <------ Dia
				dia = "1"
				mes = mes + 1
				if mes == 13:# <------ Mes
					mes = "1"
					Any = Any + 1
					print "D"+str(dia)+"-M"+str(mes)+"-A"+str(Any)+"-H"+str(hora)+"-Mn"+str(minut)+"-S"+str(segon)
				else:# 				<------ Mes
					print "D"+str(dia)+"-M"+str(mes)+"-A"+str(Any)+"-H"+str(hora)+"-Mn"+str(minut)+"-S"+str(segon)
			else:# 					<------ Dia
				print "D"+str(dia)+"-M"+str(mes)+"-A"+str(Any)+"-H"+str(hora)+"-Mn"+str(minut)+"-S"+str(segon)
		else:# 					<------ Hora
			print "D"+str(dia)+"-M"+str(mes)+"-A"+str(Any)+"-H"+str(hora)+"-Mn"+str(minut)+"-S"+str(segon)
	else:# 					<------ Minut
		print "D"+str(dia)+"-M"+str(mes)+"-A"+str(Any)+"-H"+str(hora)+"-Mn"+str(minut)+"-S"+str(segon)
else:#					<------ Segon
	segon = segon + 1
	print "D"+str(dia)+"-M"+str(mes)+"-A"+str(Any)+"-H"+str(hora)+"-Mn"+str(minut)+"-S"+str(segon)
espacio2 = 0
while espacio2 < 17:
	espacio2 += 1
	print""
"""

"""*******************************************
* Exercici5. Maquina expendedora de diners
*******************************************"""

extrac= int(raw_input("Introdueix la cuantitat a extreure: "))
b500 = extrac / 500
if b500 > 0:
	print b500,"billets de 500"
extrac = extrac - 500 * b500

b200 = extrac / 200
if b200 > 0:
	print b200,"billets de 100"
extrac = extrac - 200 * b200

b100 = extrac / 100
if b100 > 0:
	print b100,"billets de 100"
extrac = extrac - 100 * b100

b50 = extrac / 50
if b50 > 0:
	print b50,"billets de 50"
extrac = extrac - 50 * b50
	
b20 = extrac / 20
if b20 > 0:
	print b20,"billets de 20"
extrac = extrac - 20 * b20
		
b10 = extrac / 10
if b10 > 0:
	print b10,"billets de 10"
extrac = extrac - 10 * b10
			
b5 = extrac / 5
if b5 > 0:
	print b5,"billets de 5"
extrac = extrac - 5 * b5

b2 = extrac / 2
if b2 > 0:
	print b2,"monedes de 2"
extrac = extrac - 2 * b2

b1 = extrac / 1
if b1 > 0:
	print b1,"monedes de 1"
