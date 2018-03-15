#!/usr/bin/env python
# -*- coding: utf-8 -*-

file = open("/home/marc/Downloads/Fedora-Workstation-Live-x86_64-27-1.6.iso","rb") #rb read bytes
file2 = open("misco.iso","wb") #wb write bytes

while True:
	line=file.read(1024) #Copiara el archivo tal cual cada X bytes
	if(line==""):
		break
	file2.write(line)

file.close()
file2.close()
