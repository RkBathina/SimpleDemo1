package com.prep.trees;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    BinaryTreeNode root;

    // Add a node (Binary Tree insertion)
    void addNode(BinaryTreeNode parent, int value, boolean isLeft) {
        if (isLeft) {
            parent.left = new BinaryTreeNode(value);
        } else {
            parent.right = new BinaryTreeNode(value);
        }
    }

    // Traversals
    void inOrder(BinaryTreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void preOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(BinaryTreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
    
    boolean search(BinaryTreeNode node, int value) {
        if (node == null) {
            return false;
        }
        if (node.data == value) {
            return true;
        }
        return search(node.left, value) || search(node.right, value);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTreeNode(1);
        tree.addNode(tree.root, 2, true); // Left child of root
        tree.addNode(tree.root, 3, false); // Right child of root
        tree.addNode(tree.root.left, 4, true); // Left child of node 2 Left -> Root -> Right. Root -> Left -> Right. Left -> Right -> Root.

        System.out.print("In-Order Traversal: "); //4,2,1,3
        tree.inOrder(tree.root); 

        System.out.print("\nPre-Order Traversal: "); //1,2,4,3
        tree.preOrder(tree.root); 

        System.out.print("\nPost-Order Traversal: ");//4,2,3,1
        tree.postOrder(tree.root); 
        
        // Search example
        int searchValue = 4;
        System.out.print("\nSearching for " + searchValue + ": ");
        System.out.println(tree.search(tree.root, searchValue) ? "Found" : "Not Found");
    }
}
