import pygame

pygame.init()
screen = pygame.display.set_mode((1000, 607))
clock = pygame.time.Clock()
square_pos = pygame.Rect(50, 50, 150, 150)
while True:
    if pygame.event.get(pygame.QUIT): break
    keys = pygame.key.get_pressed()
    if keys[pygame.K_UP]:
        square_pos.y -= 20
    if keys[pygame.K_DOWN]:
        square_pos.y += 20
    if keys[pygame.K_LEFT]:
        square_pos.x -= 20
    if keys[pygame.K_RIGHT]:
        square_pos.x += 20
    screen.fill("black")
    pygame.draw.rect(screen, "red", square_pos)
    pygame.display.flip()
    clock.tick(60)
pygame.quit()