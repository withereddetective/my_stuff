def nuke(n: int) -> list:
    a = []
    for i in range(10):
        a.append(nuke(n-1))
    else:
        a.append(i)
    return a

if __name__ == "__main__":
    print(nuke(1))