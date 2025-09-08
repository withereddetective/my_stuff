class node:
    def __init__(self, value):
        self.right = None
        self.left = None
        self.value = value

given_values = [8, 5, 23, 12, 6, 9]

def insert(root, key):
    if root is None:
        return node(key)
    elif root.value == key:
        return root
    elif root.value < key:
        root.right = insert(root.right, key)
    else:
        root.left = insert(root.left, key)
    return root

def inorder(root):
    if root:
        inorder(root.left)
        print(root.value, end=" ")
        inorder(root.right)

root = node(given_values[0])
for i in range(len(given_values) - 1):
    root = insert(root, given_values[i + 1])
inorder(root)