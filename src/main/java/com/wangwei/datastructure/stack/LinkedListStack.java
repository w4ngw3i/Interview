package com.wangwei.datastructure.stack;

import com.wangwei.datastructure.linkedlist.LinkedList;

/**
 * @Auther wangwei
 * @Date 2018/5/2 下午2:06
 */
public class LinkedListStack<E> implements Stack<E> {

    private LinkedList<E> linkedList;

    public LinkedListStack(){
        linkedList = new LinkedList<>();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void push(E e) {

        linkedList.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedList.removeFirst();
    }

    @Override
    public E peek() {
        return linkedList.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: top ");
        builder.append(linkedList);
        return builder.toString();

    }
}
