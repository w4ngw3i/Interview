package com.wangwei.datastructure.stack;

import com.wangwei.datastructure.stack.ArrayStack;

/**
 * @Auther wangwei
 * @Date 2018/5/1 下午12:44
 */
public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
