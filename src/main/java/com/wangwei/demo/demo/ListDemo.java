package com.wangwei.demo.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(5);
        list.forEach(i -> System.out.println(i));

        list2.add(3);
        list2.add(1);
        list2.add(6);

        list2.forEach(i -> System.out.println(i));
    }
}
