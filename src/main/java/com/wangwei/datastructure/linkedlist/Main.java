package com.wangwei.datastructure.linkedlist;

/**
 * @Auther wangwei
 * @Date 2018/5/2 上午9:54
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
            System.out.println(list);
        }

        list.add(2, 666);
        System.out.println(list);
    }
}
