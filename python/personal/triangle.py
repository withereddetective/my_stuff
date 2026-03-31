def print_centered_triangle_center(rows: int):
    for i in range(1, rows + 1):                         # 
        print(('*' * (2 * i - 1)).center(2 * rows - 1))  #

def main():
    print_centered_triangle_center(int(input("how big is triangle?: ")))

if __name__ == "__main__":
    main()