package com.wangwei.datastructure.binarytree;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        for (int i = 0; i < 10; i++) {
            bst.add(i);
        }

        bst.preOrder();
    }
}
