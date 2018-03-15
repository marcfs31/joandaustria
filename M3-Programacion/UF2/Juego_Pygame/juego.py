#!/usr/bin/env python
# -*- coding: utf-8 -*-
 
# Módulos
# Poner iconos a lo space invaders que caigan del cielo y que mate a enemigos
import pygame
from pygame.locals import *
import sys, random

# Constantes

BLACK = (0, 0, 0, 255)
WHITE = (255, 255, 255, 255)

# Definir tamaño del display y el area
W, H = 800, 600
HW, HH = W / 2, H / 2
AREA = W * H
FPS = 500

# --------------------------------------------------------------------- 
# Clases

# ---------------------------------------------------------------------
# Funciones generales
# ---------------------------------------------------------------------

# Salir del programa
def events():
	for event in pygame.event.get():
		if event.type == QUIT or (event.type == KEYDOWN and event.key == K_ESCAPE):
			pygame.quit()
			sys.exit()

# ---------------------------------------------------------------------
# Funciones del juego
# ---------------------------------------------------------------------

# ---------------------------------------------------------------------
# Programa Principal
# --------------------------------------------------------------------- 
def main():
	# Inicializaciones pygame y display
	pygame.init()
	DS = pygame.display.set_mode((W, H))
	pygame.display.set_caption("Juego")
	
	# Fondo
	bg = pygame.image.load("images/fondoas.png").convert()
	bgWidth, bgHeight = bg.get_rect().size
	
	# Variables de stage, jugador, posicion y velocidad
	stageWidth = bgWidth * 2
	stagePosX = 0
	
	startScrollingPosX = HW
	
	circleRadius = 25
	circlePosX = circleRadius
	
	playerPosX = circleRadius
	playerPosY = 540 # Posicion inicial del jugador
	playerVelocityX = 0 
	
	CLOCK = pygame.time.Clock()
	
	while True:
		events()
		
		# Movimiento personaje
		k = pygame.key.get_pressed()
		
		if k[K_RIGHT]:
			playerVelocityX = 1
		elif k[K_LEFT]:
			playerVelocityX = -1
		else:
			playerVelocityX = 0
		
		# Colisiones paredes y movimiento lateral del display
		playerPosX += playerVelocityX
		
		if playerPosX > stageWidth - circleRadius:
			playerPosX = stageWidth - circleRadius
			
		if playerPosX < circleRadius:
			playerPosX = circleRadius
			
		if playerPosX < startScrollingPosX:
			circlePosX = playerPosX
		elif playerPosX > stageWidth - startScrollingPosX:
			circlePosX = playerPosX - stageWidth + W
		else:
			circlePosX = startScrollingPosX
			stagePosX += -playerVelocityX
		
		rel_x = stagePosX % bgWidth
		DS.blit(bg, (rel_x - bgWidth, 0))
		
		if rel_x < W:
			DS.blit(bg, (rel_x, 0))
			
		#Imprimir circulo
		pygame.draw.circle(DS, WHITE, (circlePosX, playerPosY - 25), circleRadius, 0)
		
		pygame.display.update()
		CLOCK.tick(FPS)
		DS.fill(BLACK)
		
	return 0
 
if __name__ == '__main__':
	pygame.init()
	main()
