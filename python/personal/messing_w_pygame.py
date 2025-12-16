import pygame
import random

class Snake:
    def __init__(self, screen, color, start_x, start_y, size):
        self.screen = screen
        self.color = color
        self.size = size
        self.body = [pygame.Rect(start_x, start_y, size, size)]
        self.direction = (1, 0)
        self.grow = False

    def move(self):
        head_x, head_y = self.direction
        new_x = self.body[0].x + head_x * self.size
        new_y = self.body[0].y + head_y * self.size
        new_head = pygame.Rect(new_x, new_y, self.size, self.size)
        self.body.insert(0, new_head)
        if self.grow == True:
            self.grow = False
        else:
            self.body.pop()

    def change_direction(self, new_dir):
        if new_dir * -1 != self.direction or new_dir * -1 != self.direction:
            self.direction = new_dir

    def draw(self):
        for segment in self.body:
            pygame.draw.rect(self.screen, self.color, segment)

class Apple:
    def __init__(self, screen, size, screen_width, screen_height):
        self.screen = screen
        self.size = size
        self.screen_width = screen_width
        self.screen_height = screen_height
        self.rect = pygame.Rect(0, 0, size, size)
        self.spawn([])

    def spawn(self, snake_body):
        while True:
            x = random.randrange(0, self.screen_width, self.size)
            y = random.randrange(0, self.screen_height, self.size)
            self.rect.topleft = (x, y)
            if not any(segment.colliderect(self.rect) for segment in snake_body):
                break

    def draw(self):
        pygame.draw.rect(self.screen, "red", self.rect)

def update_game_speed(snake_length):
    speed_increase_interval = 5
    ms_reduction_per_interval = 5
    intervals_passed = max(0, (snake_length - 1) // speed_increase_interval)
    new_delay = max(50, 150 - (intervals_passed * ms_reduction_per_interval))
    pygame.time.set_timer(SCREEN_UPDATE, new_delay)

pygame.init()
SCREEN_WIDTH = 600
SCREEN_HEIGHT = 600
screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
pygame.display.set_caption("Snake Game")
clock = pygame.time.Clock()
SNAKE_SIZE = 20
my_snake = Snake(screen, "green", start_x=200, start_y=200, size=SNAKE_SIZE)
my_apple = Apple(screen, SNAKE_SIZE, SCREEN_WIDTH, SCREEN_HEIGHT)

SCREEN_UPDATE = pygame.USEREVENT
pygame.time.set_timer(SCREEN_UPDATE, 150)

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

        if event.type == SCREEN_UPDATE:
            my_snake.move()
            update_game_speed(len(my_snake.body))

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_UP and my_snake.direction != ((0, 1)):
                my_snake.change_direction((0, -1))
            if event.key == pygame.K_DOWN and my_snake.direction != ((0, -1)):
                my_snake.change_direction((0, 1))
            if event.key == pygame.K_LEFT and my_snake.direction != ((1, 0)):
                my_snake.change_direction((-1, 0))
            if event.key == pygame.K_RIGHT and my_snake.direction != ((-1, 0)):
                my_snake.change_direction((1, 0))

    if my_snake.body[0].colliderect(my_apple.rect):
        my_snake.grow = True
        my_apple.spawn(my_snake.body)
    
    if (my_snake.body[0].right > SCREEN_WIDTH or 
        my_snake.body[0].left < 0 or 
        my_snake.body[0].bottom > SCREEN_HEIGHT or 
        my_snake.body[0].top < 0):
        running = False

    for segment in my_snake.body[1:]:
        if my_snake.body[0].colliderect(segment):
            running = False
            break

    screen.fill("black")
    my_apple.draw()
    my_snake.draw()
    pygame.display.flip()
    clock.tick(60)

pygame.quit()
