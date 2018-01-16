texto = input("Pon algo: ")
cantidad=0
vocal=0
for i in texto:
	cantidad=cantidad+1
	letra=texto.count(i)
	if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u"):
		vocal = vocal +1

print("El texti tiene",cantidad,"letras y",vocal,"vocales")
