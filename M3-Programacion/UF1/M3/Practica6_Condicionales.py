# encoding: utf-8
"""*******************************************
* Demana nom i edat, i si ets major d'edat d'edat t'havisa que pots anar a la preso
*******************************************"""
"""
nom = raw_input("Escriu el teu nom: ")
edat = int(input("Escriu la teva edat: "))

if edat >= 18:
    print "Vostè ja pot anar a la presó!"
print "Adeu " + nom
"""

"""*******************************************
* Ordena ascendentmen dos valors
*******************************************"""
"""
num1 = int(input("Escriu el primer numero: "))
num2 = int(input("Escriu el segón numero: "))

if num1 < num2:
	print num1,"i",num2
else:
	print num2,"i",num1
"""

"""*******************************************
* 
*******************************************"""
"""
num1 = int(input("Escriu el primer numero: "))
num2 = int(input("Escriu el segón numero: "))
producte = num1 * num2
if producte == 0:
	print "Es igual que 0"
elif producte < 0:
	print "Es menor que 0"
else:
	print "Es major que 0"
"""

"""*******************************************
* 
*******************************************"""
"""
entrada = raw_input("Introduce un unico caracter cualquiera: ")
if entrada == "0" or entrada == "1" or entrada == "2" or entrada == "3" or entrada == "4" or entrada == "5" or entrada == "6" or entrada == "7" or entrada == "8" or entrada == "9":
	print "Es un digit"
else:
	print "Adios"
"""

"""*******************************************
* 
*******************************************"""
"""
preu = float(input("Introdueix el preu original: "))
descompte = float(input("Introdueix el preu pagat: "))
if preu > descompte:
	percentatge = preu - descompte
	percentatge = percentatge / preu
	percentatge = percentatge * 100
	print "Tens un descompte del",int(percentatge),"%"
	print "Has pagat",preu - descompte,"€ menys"
elif preu <descompte:
	print "No hi ha descompte"
"""

"""*******************************************
* 
*******************************************"""
"""
dia = int(input("Introdueix el Dia (DD): "))
mes = int(input("Introdueix el Mes (MM): "))
Any = int(input("Introdueix l'Any (AAAA): "))
hora = int(input("Introdueix l'Hora (HH): "))
minut = int(input("Introdueix els Minuts (MnMn): "))
segon = int(input("Introdueix els Segons (SS): "))

# Comprovacio d'errors, que els valors introduits siguin correctes
if mes > 12 or mes < 1:# <------ Mes
	print "\n<<<No has introdiut be el Mes!>>>"
elif dia > 30 or dia < 1:# <------ Dia
	print "\n<<<No has introdiut be el Dia!>>>"
elif hora > 23 or hora < 0:# <------ Hora
	print "\n<<<No has introdiut be l’Hora!>>>"
elif minut > 59 or minut < 0:# <------ Minut
	print "\n<<<No has introdiut be els Minuts!>>>"							      
elif segon > 59 or segon < 0:# <------ Segon
	print "\n<<<No has introdiut be els Segons>>>"					  

else: # Si tot es correcte es procedeix a fer el calcul
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
"""

"""*******************************************
* 
*******************************************"""
"""
print "Calculadora senzilla"
num1 = int(input("Introdueix el primer numero amb el que vulguis operar: "))
op = raw_input("Intoduexi l'operació a realitzar(+ - * /): ")
num2 = int(input("Introdueix el segon numero amb el que vulguis operar: "))
if op == "+":
	print "El resultat es:", num1+num2
elif op == "-":
	print "El resultat es:", num1-num2
elif op == "*":
	print "El resultat es:", num1*num2
elif op == "/":
	if num2 == 0:
		print "No pots dividir entre 0"
	else:
		print "El resultat es:", num1/num2
"""

"""*******************************************
* 
*******************************************"""
"""
nom = raw_input("Nom del pacient: ")
edat = int(input("Edat del pacient: "))
print "Responde SI o NO a les següents preguntes"
print "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"
simptoma1 = raw_input("Tens estornuts?: ")
simptoma2 = raw_input("Tens mal de cap?: ")
simptoma3 = raw_input("Tens problemes d'estomac?: ")
simptoma4 = raw_input("Tens tos?: ")

if simptoma1 == "si" or simptoma1 == "Si" or simptoma1 == "sI" or simptoma1 == "SI" and simptoma2 == "si" or simptoma2 == "Si" or simptoma2 == "sI" or simptoma2 == "SI":
	if simptoma3 == "si" or simptoma3 == "Si" or simptoma3 == "sI" or simptoma3 == "SI":
		print "\nEt recomano que prenguis paracetamol"
	else:
		print "Et recomano àcid acetil salicílic (AAS)"
elif simptoma4 == "si" or simptoma4 == "Si" or simptoma4 == "sI" or simptoma4 == "SI" and simptoma4 == "si" or simptoma4 == "Si" or simptoma4 == "sI" or simptoma4 == "SI":
	if edat >= 12:
		print "\nPrente un caramel de d'eucaliptus"
	else:
		print "\nPrente un caramel de mel"
else:
	print "\nVina a veurem a la consulta, al Carre Major"
"""

"""*******************************************
* 
*******************************************"""
"""
semafor = raw_input("Escriu el color del semafor(vermell, groc, o verd): ")
if semafor == "vermell" or semafor == "Vermell" or semafor == "VERMELL":
	print("\nQuiet!! Encara no pots pasar, espera que es posi verd.")
elif semafor == "groc" or semafor == "Groc" or semafor == "GROC":
	print("\nNo corris. Millor espera que es torni a possar verd.")
elif semafor == "verd" or semafor == "Verd" or semafor == "VERD":
	print ("\nAra es verd, pots creuar.")
else:
	print ("\n"+semafor+" no es un color del semafor")
"""

"""*******************************************
* 
*******************************************"""
"""
fills = int(input("Quants fills tens?: "))
if fills < 0:
	print "Error, no pots tenir menys que 0 fills!"
elif fills == 0:
	print "Tot el que t'has estalviat en bolquers!"
elif fills == 1:
	print "Compte de no mimar-lo massa!"
elif fills >1 and fills <5:
	print "No t'avorreixes a casa eh?"
elif fills > 4:
	print "Tu sí fas país!"
"""

"""*******************************************
* Calculadora d'equacions de segon grau
*******************************************"""
"""
import math
print "Tenim l'equació de segon grau ax² + bx + c = 0\nIntrodueix els valors de a, b i c per resoldrela"
a = int(input("Valor de a: "))
b = int(input("Valor de b: "))
c = int(input("Valor de c: "))
inarrel = (b ** 2) - (4 * a * c)
if a == 0:
	print "No es pot resoldre"
else:
	if inarrel < 0:
		print "L'interior de l'arrel dona", inarrel,"i no es pot resoldre l'equació"
	else:
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
* Ascensor, programa fet amb una funció
*******************************************"""
"""
import time

def ascensor(planta = 0):
	
	print "Som al pis", planta
	escollir = int(input("Per anar a cualsevol pis escrigui el numero del pis\nTenim planta baixa(0), primer pis(1), segon pis(2). A quin vols anar?: "))
	
	if planta < escollir and escollir <= 2:
		x = escollir - planta
		planta = escollir
		print "Pujant al pis",planta
		time.sleep(x)
		print "Ding! Ja hem arribat.\n"
	elif planta > escollir and escollir >= 0:
		x = planta - escollir
		planta = escollir
		print "Baixant al pis",planta
		time.sleep(x)
		print "Ding! Ja hem arribat.\n"
	elif planta == escollir:
		print "Ja ets al pis", escollir,"\n"
	else:
		print "\n<<< No tenim el pis", escollir,">>>\n"
	
	ascensor(planta)

ascensor()
"""

"""*******************************************
* Ascensor, programa fet sense funció
*******************************************"""
"""
import time

planta = int(input("planta baixa(0), primer pis(1), segon pis(2), a quin pis som?(escrigui el numero del pis): "))
escollir = int(input("Per anar a cualsevol pis escrigui el numero del pis. A quin vols anar?: "))

if planta < escollir and escollir <= 2:
	x = escollir - planta
	planta = escollir
	print "Pujant al pis",planta
	time.sleep(x)
	print "Ding! Ja hem arribat.\n"
elif planta > escollir and escollir >= 0:
	x = planta - escollir
	planta = escollir
	print "Baixant al pis",planta
	time.sleep(x)
	print "Ding! Ja hem arribat.\n"
elif planta == escollir:
	print "Ja ets al pis", escollir,"\n"
else:
	print "\n<<< No tenim el pis", escollir,">>>\n"
"""
