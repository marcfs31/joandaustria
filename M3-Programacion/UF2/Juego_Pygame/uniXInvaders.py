import pygame
from pygame.locals import *
import sys
import random

class UNIXinvaders:
	def __init__(self):
		self.puntos = 0
		self.vidas = 2
		pygame.font.init()
		self.font = pygame.font.Font("images/Comfortaa-Regular.ttf", 25)
		#Declarar barrera
		barrera = [[],[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
						[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
						[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
						[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],
						[1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1],]
	
		self.pantalla = pygame.display.set_mode((800, 600))
		#Sprites
		self.spritesEnemigos = {
				0:[pygame.image.load("images/linux.png").convert(), pygame.image.load("images/linux.png").convert()],
				1:[pygame.image.load("images/linux.png").convert(), pygame.image.load("images/linux.png").convert()],
				2:[pygame.image.load("images/linux.png").convert(), pygame.image.load("images/linux.png").convert()],
				}
		#Declarar todo lo necesario
		self.jugador = pygame.image.load("images/winxp.png").convert()
		self.animacion = 0
		self.direccion = 1
		self.velocidadEnemigo = 20
		self.ultimoMovEnemigo = 0
		self.jugadorX = 400
		self.jugadorY = 500
		self.bala = None
		self.balas = []
		self.enemigos = []
		self.particulasBarrera = []
		inicioY = 50
		inicioX = 50
		
		for filas in range(6):
			out = []
			if filas < 2:
				enemigo = 0
			elif filas < 4:
				enemigo = 1
			else:
				enemigo = 2
			for columnas in range(10):
				out.append((enemigo,pygame.Rect(inicioX * columnas, inicioY * filas, 35, 35)))
			self.enemigos.append(out)
		self.chance = 990
	
		barreraX = 50
		barreraY = 400
		space = 100
	
		for offset in range(1, 5):
			for b in barrera:
				for b in b:
					if b != 0:
						self.particulasBarrera.append(pygame.Rect(barreraX + space * offset, barreraY, 5,5))
					barreraX += 5
				barreraX = 50 * offset
				barreraY += 3
			barreraY = 400
	
	def enemigoUpdate(self):
		if not self.ultimoMovEnemigo:
			for enemigo in self.enemigos:
				for enemigo in enemigo:
					enemigo = enemigo[1]
					if enemigo.colliderect(pygame.Rect(self.jugadorX, self.jugadorY, self.jugador.get_width(), self.jugador.get_height())):
						self.vidas -= 1
						self.reiniciarJugador()
					enemigo.x += self.velocidadEnemigo * self.direccion
					self.ultimoMovEnemigo = 25
					if enemigo.x >= 750 or enemigo.x <= 0:
						self.moveEnemiesDown()
						self.direccion *= -1
					
					chance = random.randint(0, 1000)
					if chance > self.chance:
						self.balas.append(pygame.Rect(enemigo.x, enemigo.y, 5, 10))
						self.puntos += 5
			if self.animacion:
				self.animacion -= 1                                                                                                                                                        
			else:
				self.animacion += 1
		else:
			self.ultimoMovEnemigo -= 1
	
		
	def moveEnemiesDown(self):
		for enemigo in self.enemigos:
			for enemigo in enemigo:
				enemigo = enemigo[1]
				enemigo.y += 20
	
	def actualizarJugador(self):
		key = pygame.key.get_pressed()
		if key[K_RIGHT] and self.jugadorX < 800 - self.jugador.get_width():
			self.jugadorX += 5
		elif key[K_LEFT] and self.jugadorX > 0:
			self.jugadorX -= 5
		if key[K_SPACE] and not self.bala:
			self.bala = pygame.Rect(self.jugadorX + self.jugador.get_width() / 2- 2, self.jugadorY - 15, 5, 10)
	
	def actualizarBala(self):
		for i, enemigo in enumerate(self.enemigos):
			for j, enemigo in enumerate(enemigo):
				enemigo = enemigo[1]
				if self.bala and enemigo.colliderect(self.bala):
					self.enemigos[i].pop(j)
					self.bala = None
					self.chance -= 1
					self.puntos += 100
				
		if self.bala:
			self.bala.y -= 20
			if self.bala.y < 0:
				self.bala = None
	
	
		for x in self.balas:
			x.y += 20
			if x.y > 600:
				self.balas.remove(x)
			if x.colliderect(pygame.Rect(self.jugadorX, self.jugadorY, self.jugador.get_width(), self.jugador.get_height())):
				self.vidas -= 1
				self.balas.remove(x)
				self.reiniciarJugador()
	
		for b in self.particulasBarrera:
			check = b.collidelist(self.balas)
			if check != -1:
				self.particulasBarrera.remove(b)
				self.balas.pop(check)
				self.puntos += 10
			elif self.bala and b.colliderect(self.bala):
				self.particulasBarrera.remove(b)
				self.bala = None
				self.puntos += 10
	def reiniciarJugador(self):
		self.jugadorX = 400

	def ejecutar(self):
		clock = pygame.time.Clock()
		for x in range(3):
			self.moveEnemiesDown()
		while True:
			clock.tick(60)
			self.pantalla.fill((0,0,0))
			for event in pygame.event.get():
				if event.type == QUIT and event.key == K_ESCAPE:
					sys.exit()
			for enemigo in self.enemigos:
				for enemigo in enemigo:
					self.pantalla.blit(pygame.transform.scale(self.spritesEnemigos[enemigo[0]][self.animacion], (35,35)), (enemigo[1].x, enemigo[1].y))
			self.pantalla.blit(self.jugador, (self.jugadorX, self.jugadorY))
			if self.bala:
				pygame.draw.rect(self.pantalla, (255, 61, 0), self.bala)
			for bala in self.balas:
				pygame.draw.rect(self.pantalla, (41, 121, 255), bala)
			for b in self.particulasBarrera:
				pygame.draw.rect(self.pantalla, (52, 255, 0), b)
			
			if not self.enemigos: #Si no hay enemigos
				self.pantalla.blit(pygame.font.Font("images/Comfortaa-Regular.ttf", 100).render("Has ganado!", -1, (52,255,0)), (100, 200))
			elif self.vidas > 0: #Si las vidas son mas de 0
				self.actualizarBala()
				self.enemigoUpdate()
				self.actualizarJugador()
			elif self.vidas == 0: #Si las vidas son 0 pierdes
				self.pantalla.blit(pygame.font.Font("images/Comfortaa-Regular.ttf", 100).render("Has perdido!", -1, (52,255,0)), (100, 200))
			
			#Mostrar vidas y puntos
			self.pantalla.blit(self.font.render("Vidas: {}".format(self.vidas), -1, (255,255,255)), (20, 10))
			self.pantalla.blit(self.font.render("Puntos: {}".format(self.puntos), -1, (255,255,255)), (400, 10))
			pygame.display.flip()


if __name__ == "__main__":
	UNIXinvaders().ejecutar()
