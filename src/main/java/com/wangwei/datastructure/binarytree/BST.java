package com.wangwei.datastructure.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
     * 获取二分搜索树中最小元素
     * @return
     */
    public E minimum(){
        if (size == 0)
            throw new IllegalArgumentException("BST is Empty");
        return minimum(root).e;
    }

    /**
     * 获取二分搜索树中最大元素
     * @return
     */
    public E minimax(){
        if (size == 0)
            throw new IllegalArgumentException("BST is Empty");
        return minimax(root).e;
    }

    /**
     * 从二分搜索树中删除最小值所在节点，返回最小值
     * @return
     */
    public E removeMin(){
        E e = minimum();
        root = removeMin(root);
        return e;
    }

    /**
     * 从二分搜索树中删除最大值所在节点，返回最小值
     * @return
     */
    public E removeMax(){
        E e = minimax();
        root = removeMax(root);
        return e;
    }

    /**
     * 从二分搜索树中删除元素为e的节点
     * @param e
     */
    public void remove(E e){
        root = remove(root, e);
    }

    /**
     * 删除以node为根的二分搜索树中值为e的节点 递归算法
     * 返回删除节点后返回新的二分搜索树的根
     * @param node
     * @param e
     * @return
     */
    private Node remove(Node node, E e){
        if (node == null)
            return null;
        if (e.compareTo(node.e) < 0){
            node.left = remove(node.left, e);
            return node;
        }
        else if (e.compareTo(node.e) > 0){
            node.right = remove(node.right, e);
            return node;
        }else {//e == node.e
            //待删除节点左子树为空的情况
            if (node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            //待删除节点右子树为空的情况
            if (node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }

            /**
             * 待删除节点左右子树均不为空的情况
             * 找到比待删除节点大的最小节点，即待删除节点右字树的最小节点
             * 用这个节点顶替待删除节点的位置
             */
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            successor.left = node.left;

            node.left = node.right = null;

            return successor;
        }
    }

    /**
     * 删除以node为根的二分搜索树中最小节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMin(Node node){
        if (node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    /**
     * 删除以node为根的二分搜索树中最大节点
     * 返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMax(Node node){
        if (node.right == null){
            Node rightNode = node.left;
            node.left = null;
            size--;
            return rightNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    /**
     * 返回以node为根节点二分搜索树中最小元素所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node){
        if (node.left == null)
            return node;
       return minimum(node.left);
    }

    /**
     * 返回以node为根节点二分搜索树中最大元素所在的节点
     * @param node
     * @return
     */
    private Node minimax(Node node){
        if (node.right == null)
            return node;
       return minimax(node.right);
    }

    /**
     * 二分搜索树的前序遍历
     */
    public void preOrder(){
        preOrder(root);
    }

    /**
     * 二分搜索树的中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }

    /**
     * 二分搜索树的后序遍历
     */
    public void postOrder(){
        postOrder(root);
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


    /**
     * 二分搜索树的前序遍历, 非递归算法
     */
    private void preOrderNR(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);

            if (cur.right != null)
                stack.push(cur.right);
            if (cur.left != null)
                stack.push(cur.left);
        }

    }


    /**
     * 二分搜索树的中序遍历, 递归算法
     * @param node
     */
    private void inOrder(Node node){
        if (node == null)
            return;
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);
    }

    /**
     * 二分搜索树的后序遍历, 递归算法
     * @param node
     */
    private void postOrder(Node node){
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);
    }

    /**
     * 二分搜索树的层序遍历/广度遍历
     */
    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cur = queue.remove();
            System.out.println(cur.e);

            if (cur.left != null)
                queue.add(cur.left);
            if (cur.right != null)
                queue.add(cur.right);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);

        return res.toString();
    }


    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null){
            res.append(generateDepthString(depth) + "null\n");
            return;
        }
        res.append(generateDepthString(depth) + node.e + "\n");
        generateBSTString(node.left, depth+1, res);
        generateBSTString(node.right, depth+1, res);
    }

    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++)
            res.append("--");
        return res.toString();
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
