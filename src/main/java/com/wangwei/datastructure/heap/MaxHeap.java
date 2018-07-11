package com.wangwei.datastructure.heap;

import com.wangwei.datastructure.array.Array;

public class MaxHeap<E extends Comparable<E>>  {
    private Array<E> data;

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap() {
        data = new Array<>();
    }

    /**
     * 获取堆中元素个数
     * @return
     */
    public int size(){
        return data.getSize();
    }

    /**
     * 返回一个布尔值判断堆是否为空
     * @return
     */
    public boolean isEmpty(){
        return data.isEmpty();
    }

    /**
     * 返回完全二叉树的数组表示中，一个索引所表示的元素的父亲节点的索引
     * @param index
     * @return
     */
    private int parent(int index){
        if (index == 0)
            throw new IllegalArgumentException("index-0 does't have parent.");
        return (index - 1) / 2;
    }

    /**
     * 返回完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
     * @param index
     * @return
     */
    private int leftChild(int index){
        return (index*2)+1;
    }
}
