package com.prep.trees;

class Node {
    int value;
    Node left, right;

    // Constructor to create a new node
    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;


    // Insert a new value into the BST using recursion
    void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive function to insert values
    private Node insertRec(Node root, int value) {
        
        if (root == null) {
            root = new Node(value);
            return root;
        }

       
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        
        return root;
    }

    // In-order traversal (Left -> Root -> Right)
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    // Pre-order traversal (Root -> Left -> Right)
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // Post-order traversal (Left -> Right -> Root)
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }
    
 // Search for a value in the BST
    boolean search(int value) {
        return searchRec(root, value);
    }

    
    private boolean searchRec(Node root, int value) {
        if (root == null) {
            return false; 
        }

        if (root.value == value) {
            return true; 
        }

        if (value < root.value) {
            return searchRec(root.left, value); 
        } else {
            return searchRec(root.right, value); 
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

       
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

       
        System.out.print("In-order Traversal: ");
        bst.inOrder(bst.root); 
        System.out.println();

        
        System.out.print("Pre-order Traversal: ");
        bst.preOrder(bst.root); 
        System.out.println();

        
        System.out.print("Post-order Traversal: ");
        bst.postOrder(bst.root); 
        
        int searchValue = 4;
        System.out.print("\nSearching for " + searchValue + ": ");
        System.out.println(bst.search(searchValue) ? "Found" : "Not Found");
    }
}
