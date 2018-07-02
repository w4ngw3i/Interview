package com.wangwei.datastructure.binarytree;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] arr = new int[]{2,3,4,8,5,6};
        for (int i = 0; i < arr.length; i++) {
            bst.add(arr[i]);
        }

//        bst.preOrder();
        System.out.println(bst);
        bst.inOrder();
        System.out.println();
        bst.postOrder();
    }
}
