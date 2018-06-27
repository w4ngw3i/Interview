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
        root = add(root, e);
    }

    /**
     * 返回插入新节点后二分搜索树的根
     * @param node
     * @param e
     */
    private Node add(Node node, E e){
        if (node == null){
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if (e.compareTo(node.e) > 0)
            node.right = add(node.right, e);
        return node;
    }

    /**
     * 判断二分搜索树是否包含某个元素
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root, e);
    }

    /**
     * 判断以根节点未起始的二分搜索树是否包含某个元素
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e){
        if (node == null)
            return false;
        if (e.compareTo(node.e) == 0)
            return true;
        else if (e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else
            return contains(node.right, e);
    }


    /**
     * 二分搜索树的前序遍历
     */
    public void preOrder(){
        preOrder(root);
    }

    /**
     * 二分搜索树的前序遍历, 递归算法
     */
    private void  preOrder(Node node){
//        if (node == null)
//            return;
        if (node != null){
            System.out.println(node.e);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    @Override
    public String toString() {
        return "BST{}";
    }

    /*    *//***
     * 向二分搜索树中添加元素
     * @param e
     *//*
    public void add(E e){
        if (root == null){
            root = new Node(e);
            size++;
        }
        else
            add(root, e);

    }*/


/*
    *//**
     * 向以node为根结点二分搜索树中插入元素e，递归算法
     * @param node
     * @param e
     *//*
    private void add(Node node, E e){

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

    }*/
}
