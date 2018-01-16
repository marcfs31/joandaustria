#encoding: utf-8
def hola():

	Castellano = "Hola mundo!"
	Catala = "Hola món!"
	English = "Hello world!"
	print " "
	print "Choos your lenguage, tip the number."
	print "1) Castellano"
	print "2) Català"
	print "3) English"

	lenguage = int(input(""))

	if lenguage == 1:
	  print Castellano
	elif lenguage == 2:
	  print Catala 
	elif lenguage == 3:
	  print English
	elif lenguage > 3:
	  print "Not be a correct number, try agein."
  	pot = hola()
hola()
