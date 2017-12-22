#!/usr/bin/env python
# -*- coding: utf-8 -*-


# Exercici 1: Cerca un caràcter
"""
text = raw_input("Introdueix un text breu: ")
lletra = raw_input("Introdueix una lletra per buscarla al text: ")
if lletra in text: 
	print "El caràcter '" + lletra + "' apareix a \"" + text + '"'
else:
	print "El caràcter '" + lletra + "' no apareix a \"" + text + '"'
"""

# Exercici 2: Nom en majúscules
"""
text = raw_input("Escriu el teu nom: ")
print text.upper()
"""

# Exercici 3: El nombre de A's
"""
text = raw_input("Escriu el teu nom: ")
num = 0
for i in text:
	if i == 'a':
		num +=1
print "El nom conté", num, "'a's"
"""

# Exercici 4: Anàlisi del nom
"""
nom = raw_input("Introdueix el teu nom: ")
length = len(nom)
vocals = 0
for i in nom:
	if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
		vocals += 1
print length, "càracters i",vocals,"vocals"
"""

# Exercici 5: Inicials en majúscules
"""
nom = raw_input("Introdueix el teu nom complet: ")
nomupper = nom[0].upper()
for i in range(1, len(nom), 1):
    if nom[i - 1] == " ":
        nomupper += nom[i].upper()
    else:
        nomupper += nom[i].lower()
print nomupper
"""

# Exercici 6: Codi Morse
"""
text = raw_input("Introdueix el text per traduir a morde: ")
text = text.lower()
morse = "morse: "
l = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0']
m = ['.-', '-...', '-.-.', '-..', '.', '..-.', '--.', '....', '..', '.---', '-.-', '.-..', '--', '-.', '---', '.--.', '--.-', '.-.', '...', '-', '..-', '...-', '.--', '-..-', '-.--', '--..', '.----', '..---', '...--', '....-', '.....', '-....', '--...', '---..', '----.', '-----']
for i in range(len(text)):
    for n in range(len(l)):
        if text[i] == l[n]:
            morse += m[n] + " "
            break
print morse
"""

# Exercici 7: Figures amb strings
"""
paraula = raw_input("Introduce una paraula: ")
l = len(paraula)
for i in range(l - 1, 0, -1):
    print paraula[i:]
for i in range(l, 0, -1):
    print paraula[:i]
"""


# Exercici 8: La piràmide
"""
paraula = raw_input("Introdueix una paraula: ")
l = len(paraula)
for i in range(1, l + 1, 1):
    lef = ""
    rig = ""
    for n in range(i):
        if n + 1 == i:
            lef += paraula[n]
            rig = paraula[n] + rig
        else:
            lef += paraula[n] + ","
            rig = "," + paraula[n] + rig
        
    for n in range(l - i):
        lef = ". " + lef
        rig += " ."
    print lef + "=" + rig
"""


# Exercici 9: Cerca d'un string

string = raw_input("String: ")
substring = raw_input("Substring: ")
if string == "":
    print "L'string no conte " + substring
elif substring == "":
    print "Esta inclos a cualsevol string no buit"
else:
    if substring in string:
        print substring + " es troba a l'string \"" + string + '"'
    else:
        print substring + " no i es a l'string \"" + string + '"'

