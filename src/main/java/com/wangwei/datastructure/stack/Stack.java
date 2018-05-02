package com.wangwei.datastructure.stack;

/**
 * @Auther wangwei
 * @Date 2018/5/1 下午12:18
 */
public interface Stack<E> {
    int getSize();

    void push(E e);

    E pop();

    E peek();

    boolean isEmpty();


}
