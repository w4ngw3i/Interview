package com.wangwei.datastructure.binarytree;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
/*        int[] arr = new int[]{2,1,2,3,4,8,5,6};
        for (int i = 0; i < arr.length; i++) {
            bst.add(arr[i]);
        }

        System.out.println(bst.minimum());
//        bst.preOrder();
//        System.out.println(bst);
//        bst.inOrder();
//        System.out.println();
//        bst.postOrder();
//        System.out.println();
//
        bst.levelOrder();*/
        Random random = new Random();

        for (int i = 0; i < 1000; i++)
            bst.add(random.nextInt(10000));

        ArrayList<Integer> nums = new ArrayList<>();
        while (!bst.isEmpty())
            nums.add(bst.removeMax());
        System.out.println(nums);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i-1) < nums.get(i))

                throw new IllegalArgumentException("error");
        }

        System.out.println("test complate");
    }
}
