package com.wangwei.datastructure.binarytree;

/**
 * @Auther wangwei
 * @Date 2018/6/24 下午4:16
 */
public class BST<E extends Comparable<E>> {

    private class Node{
        public E e;
        public Node left, right;
        public Node(E e){
            this.e = e;
            left = null;
            right = null;
        }
    }

    private int size;
    private Node root;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /***
     * 向二分搜索树中添加元素
     * @param e
     */
    public void add(E e){
        if (root == null){
            root = new Node(e);
            size++;
        }
        else
            if (e.compareTo(root.e) < 0)
                add(root.left, e);
            else
                add(root.right, e);

    }

    /**
     * 向以node为根结点二分搜索树中插入元素e，递归算法
     * @param node
     * @param e
     */
    public void add(Node node, E e){

        if (e.equals(node.e))
            return;
        else if (e.compareTo(node.e) < 0 && node.left == null){
            node.left = new Node(e);
            size++;
            return;
        }
        else if (e.compareTo(node.e) > 0 && node.right == null){
            node.right = new Node(e);
            size++;
            return;
        }

        if (e.compareTo(node.e) < 0)
            add(node.left, e);
        else
            add(node.right, e);

    }
}
