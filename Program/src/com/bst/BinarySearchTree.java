package com.bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // method to insert a node into the tree
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // helper method to insert a node into the tree recursively
    private Node insertRec(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.data) {
            node.left = insertRec(node.left, value);
        } else if (value > node.data) {
            node.right = insertRec(node.right, value);
        }

        return node;
    }

    // method to find a pair of nodes with the given sum
    public void findPairWithSum(Node node, int sum) {
        if (node == null) {
            return;
        }
        List<Node> inorderList = new ArrayList<Node>();
        getInorderList(node, inorderList);

        int left = 0, right = inorderList.size() - 1;
        boolean found = false;

        while (left < right) {
            int currentSum = inorderList.get(left).data + inorderList.get(right).data;

            if (currentSum == sum) {
                System.out.println("Pair found: (" + inorderList.get(left).data + ", " + inorderList.get(right).data + ")");
                found = true;
                left++;
                right--;
            } else if (currentSum < sum) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("Nodes not found.");
        }
    }

    private void getInorderList(Node node, List<Node> list) {
        if (node == null) {
            return;
        }
        getInorderList(node.left, list);
        list.add(node);
        getInorderList(node.right, list);
    }
}