list_ = ['skibidi fornite rizz', 'p', 'jay', 'kyle haynes', 'john quincey adams', 'george washington machine', 'the', 'big ah forehead', 2, 'p']
target = input("what is your target: ")
x = target.isalpha()
if not x:
    target = int(target)
index = []

def linear_search(list_, target):
    for i in range(len(list_)):
        if target == list_[i]:
            index.append(i)

linear_search(list_, target)
if len(index) == 1:
    print("the index of the target is " + str(index[0]))
elif len(index) == 0:
    print("target not in list")
else:
    print("your target has the index's of: ")
    print(index)