import math, random, sys
import pygame
from pygame.locals import *

# exit the program
def events():
	for event in pygame.event.get():
		if event.type == QUIT or (event.type == KEYDOWN and event.key == K_ESCAPE):
			pygame.quit()
			sys.exit()

def text(font, string, x, y, xJustify = None, yJustify = None, surface = None):
	global WHITE, BLACK
	if not surface: surface = pygame.display.get_surface()
	textSurface = font.render(string, 1, WHITE, BLACK)
	textRect = textSurface.get_rect()
	if xJustify == 1:
		x -= textRect.width
	elif xJustify == 2:
		x -= textRect.center[0]
	if yJustify == 1:
		y -= textRect.height
	elif yJustify == 2:
		y -= textRect.center[1]
	surface.blit(textSurface, (x, y))

# define display surface
W, H = 1280, 720
HW, HH = W / 2, H / 2
AREA = W * H

# initialise display
pygame.init()
CLOCK = pygame.time.Clock()
DS = pygame.display.set_mode((W, H))
pygame.display.set_caption("code.Pylet - Scrolling Background with Player")
FPS = 500

# define some colors
BLACK = (0, 0, 0, 255)
WHITE = (255, 255, 255, 255)

#Movimiento del fondo junto a la pelota
bg = pygame.image.load("images/background.png").convert
bgWidth, bgHeight = bg.get_rect().size

stageWidth = bgWidth * 2
stagePosX = 0

startScrollingPosX = HW

circleRadius = 25
circlePosX = circleRadius

playerPosX = circleRadius
playerPosY = 585

playerVelocityX = 0


# main loop
while True:
	events()

	#Movimiento de la bola
	k = pygame.key.get_pressed()
	if k[K_RIGHT]:
		playerVelocityX = 1
	elif k[K_LEFT]:
		playerVelocityX = -1
	else:
		playerVelocityX = 0
		
	playerPosX += playerVelocityX
	
	#Evitar que la bola se salga del mapa
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
		
	pygame.draw.circle(DS, WHITE, (playerPosX,playerPosY - circleRadius), circleRadius, 0)
		
	pygame.display.update()
	CLOCK.tick(FPS)
	DS.fill(BLACK)
