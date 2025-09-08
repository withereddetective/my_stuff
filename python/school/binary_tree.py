class Node:
    def __init__(self, id, name):
        self.name = name
        self.id = id
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None
    
    def insert_recursive(self, node, id, name):
        if id < node.id:
            if node.left is None:
                node.left = Node(id, name)
            else:
                self.insert_recursive(node.left, id, name)
        else:
            if node.right is None:
                node.right = Node(id, name)
            else:
                self.insert_recursive(node.right, id, name)
    
    def insert(self, id, name):
        if self.root is None:
            self.root = Node(id, name)
        else:
            self.insert_recursive(self.root, id, name)
    
    def inorder_traversal(self, node):
        if node:
            self.inorder_traversal(node.left)
            print(node.name + " with the id: " + str(node.id))
            self.inorder_traversal(node.right)
    
    def preorder_traversal(self, node):
        if node:
            print(node.name + " with the id: " + str(node.id))
            self.inorder_traversal(node.left)
            self.inorder_traversal(node.right)
    
    def postorder_traversal(self, node):
        if node:
            self.inorder_traversal(node.left)
            self.inorder_traversal(node.right)
            print(node.name + " with the id: " + str(node.id))

    def search_recursive(self, current, id_number):
        if current is None:
            return None
        if current.id == id_number:
            return current.name
        elif id_number < current.id:
            return self.search_recursive(current.left, id_number)
        else:
            return self.search_recursive(current.right, id_number)
        
    def search(self, id_number):
        return self.search_recursive(self.root, id_number)


students = [
    ("Alice", 102),
    ("Bob", 56),
    ("Charlie", 78),
    ("Diana", 230),
    ("Eve", 89),
    ("Frank", 15),
    ("Grace", 180),
    ("Hank", 300),
    ("Ivy", 120),
    ("Jack", 200),
]

database = BinaryTree()
for name, id_number in students:
    database.insert(id_number, name)

print("Inorder Traversal - Sorted Records:")
database.inorder_traversal(database.root)
print("")

print("Preorder Traversal - Sorted Records:")
database.preorder_traversal(database.root)
print("")

print("Postorder Traversal - Sorted Records:")
database.postorder_traversal(database.root)
print("")

search_result = database.search(int(input("what id will you search with?: ")))
if search_result:
    print(f"\nRecord Found: Name: " + search_result)
else:
    print("\nRecord Not Found")