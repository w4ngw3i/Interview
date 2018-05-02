package com.wangwei.datastructure.array;

import com.wangwei.datastructure.array.Array;

/**
 * @Auther wangwei
 * @Date 2018/4/30 上午9:52
 */
public class ArrayTest {

    public static void main(String[] args) {

        Array<Integer> array = new Array<>();
        for (int i = 0; i < 1000; i++) {
            array.addLast(i+1);
        }
        System.out.println(array);

//        Array<Integer> array = new Array<>();
//        for (int i = 0; i < 10; i++) {
//            array.addLast(i);
//        }
//        System.out.println(array);
//
//        array.add(1, 88);
//        System.out.println(array);
//
//        array.remove(1);
//        System.out.println(array);
//
//        array.removeElement(5);
//        System.out.println(array);
//
//        System.out.println(array.find(7));
    }
}
