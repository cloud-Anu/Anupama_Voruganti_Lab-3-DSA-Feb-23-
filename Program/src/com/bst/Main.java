package com.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // inserting nodes into the tree
        tree.insert(40);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(60);
        tree.insert(50);
        tree.insert(70);
        tree.insert(10);
        tree.insert(30);

        // finding pairs with various sums
        tree.findPairWithSum(tree.root, 40); // Pair found: (60, 70)
        tree.findPairWithSum(tree.root, 30); // Pair found: (10, 20) or (10, 20)
        tree.findPairWithSum(tree.root, 80); // Pair found: (10, 70) or (30, 50)
        tree.findPairWithSum(tree.root, 100); // Pair found: (30, 70) or (40, 60)
        tree.findPairWithSum(tree.root, 55); // Nodes not found.
    }
}

