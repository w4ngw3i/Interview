package com.wangwei.datastructure.stack;

import com.wangwei.datastructure.linkedlist.LinkedList;

/**
 * @Auther wangwei
 * @Date 2018/5/2 下午2:14
 */
public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
