# encoding: utf-8
"""*************************************************
* Es cancien els valors d'A i de B
*************************************************"""
"""
print "Elige la variable A:"
a = int(input())
print ""
print "Elige la variable B(un valor diferente a A:"
b = int(input())
print ""
a = a + b
b = a - b
a = a - b
print a
print b
"""

"""*************************************************
* Es mostra la suma de dos nombres
*************************************************"""
"""
print "Escriu dos nombres que vulguis sumar"
print "Escriu el primer nombre"
a = int(input())
print "Escriu el segon nombre"
b = int(input())
print ""
print "El resultat es", a + b
"""

"""*************************************************
* Calculem la edat que tindras d'aqui un quart de segle
*************************************************"""
"""
print "Quina edad tindras d'aqui un quart de segle?"
print "Escriu la teva edat"
a = int(input())
b = 25
print ""
print "Tindras", a + b,"anys."
"""

"""*************************************************
* Elevem al cuadrat el numero que s'introdueixi
*************************************************"""
"""
print "Introdueix el nombre per elebar al cuadrat"
a = int(input())
print ""
print "El resultat es:", a ** 2
"""

"""*************************************************
* Calculem cuantes pesetes tindriem amb els euros que posem
*************************************************"""
"""
print "A quantes pesetes equival el teu diner?"
print "Introdueix quants euros tens"
a = float(input())
print ""
print "Tindries", a * 166.386,"pessetes"
"""

"""*************************************************
* Calculem l'area dun rectangle o cuadrat
*************************************************"""
"""
print "Calculem l'area d'un rectangle"
print "Introdueix les unitats (mm, cm, m, etc)"
unitat = str(raw_input(""))
print "Introdueix la base"
base = float(input())
print "Introdueix l'altura"
altura = float(input())
print ""
print "L'area del teu rectangle es:", base * altura, unitat
"""

"""*************************************************
* Es demana el nom i la edad i es formula una frase amb aquests
*************************************************"""
"""
print "Escriu el teu nom"
nom = str(raw_input(""))
print "Escriu la teva edat"
edat = str(raw_input(""))
print ""
print "Hola", nom,", la teva edad es", edat
"""

"""*************************************************
* Fem totes les operacions sobre dos valors introduits previament
*************************************************"""
"""
print "Escriu el primer valor"
a = float(input())
print "Escriu el segun valor"
b = float(input())
print ""
print "Suma =",a + b,", resta =", a - b,", multiplicacio =", a * b,", divisio =", a / b,", modul =", a % b
"""

"""*************************************************
* Calculem el perimetre i 'area d'una circumferencia
*************************************************"""
"""
print "Calculem el perimetre i l'area d'una circumferencia"
print "Escriu el radi"
radi = float(input())
print ""
print "Perimetre =", 2 * radi * 3.1416
print "Area =", radi ** 2 * 3.1416
"""

"""*************************************************
* Es calcula el resutat de la equacio de 3r grau a·x³+b·x²+c·x+d
*************************************************"""
"""
print "Calcual la equacio de 3r grau a·x³+b·x²+c·x+d"
a = float(input("Escriu a: "))
b = float(input("Escriu b: "))
c = float(input("Escriu c: "))
d = float(input("Escriu d: "))
x = float(input("Escriu x: "))
print ""
print a * x ** 3 + b * x ** 2 + c * x + d
"""

"""*************************************************
* Calcula la cuantitat que pagaras de mes i el preu mes iva(21%)
*************************************************"""
"""
print "Calcular l'IVA afegit d'un producte"
a = float(input("El preu del producte: "))
print ""
print "L'IVA sera de:",a * 0.21, "€"
print "El preu total es:",a * 0.21 + a,"€"
"""

"""*************************************************
* Calcula la cuantitat que pagaras de mes i el preu mes iva, l'iva sintrodueix previament
*************************************************"""
"""
print "Calcular l'IVA afegit d'un producte"
a = float(input("El preu del producte: "))
iva = float(input("Indica l'IVA en percentatge (sense %): "))
iva = iva / 100
print ""
print "L'IVA sera de:",a * 0.21, "€"
print "El preu total es:",a * 0.21 + a,"€"
"""

"""*************************************************
* Mostra una taula amb els preus, les ventes i el total dels tres productes
*************************************************"""
"""
vCola = int(input("Introdueixi les ventes de Cola d'aquest mes: "))
vTaronja = int(input("Introdueixi les ventes de Taronja d'aquest mes: "))
vLlimona = int(input("Introdueixi les ventes de Llimona d'aquest mes: "))
pCola = float(input("Introdueixi el preu de Cola d'aquest mes: "))
pTaronja = float(input("Introdueixi el preu de Taronja d'aquest mes: "))
pLlimona = float(input("Introdueixi el preu de Llimona d'aquest mes: "))
tCola = vCola * pCola
tTaronja = vTaronja * pTaronja
tLlimona = vLlimona * pLlimona
total = tCola + tTaronja + tLlimona
print "------------------------------------------------------"
print "Producte	Vendes		Preu		Total"
print "------------------------------------------------------"
print "Cola		",vCola,"		",pCola,"		",tCola
print "Taronja		",vTaronja,"		",pTaronja,"		",tTaronja
print "Llimona		",vLlimona,"		",pLlimona,"		",tLlimona
print "------------------------------------------------------"
print "Total						", total"""

"""*************************************************
* Mostra l'ultim digit de cualsevol senser que s'introdueixi
************************************************"""
"""
num = str(raw_input("Introdueix un numero senser: "))
n = len(ultdigit)
n = n - 1
print "L'ultim digit es", ultdigit[n]
"""

"""*************************************************
* Respon les hores, minuts i segons a partir dels segons introduits
*************************************************"""
"""
inseconds = int(input("Escriu el segons a calcular: "))
calcmin = inseconds / 60
seconds = calcmin * 60
seconds = inseconds - seconds
hours = calcmin / 60
minutes = hours * 60
minutes = calcmin - minutes
print inseconds,"segons corresponen a",hours,"hora/es,",minutes,"minut/s i",seconds,"segon/s."
"""

"""*************************************************
* Ajunta el nom.cognom i genrea una contrasenya de 3 numeros aleatoris
*************************************************"""
import random

nom = str(raw_input("Siusplau escriu el seu nome: "))
cognom = str(raw_input("Siusplau escriu el primer cognom: "))
ident = nom.lower() + "." + cognom.lower()
print "El seu identificdo es", ident
contra = random.choice(range(100, 999))
print "La seva contrasenya es", contra
