package com.wangwei.datastructure.linkedlist;

/**
 * @Auther wangwei
 * @Date 2018/5/1 下午11:13
 */
public class LinkedList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node dummyHead;

    private int size;

    public LinkedList() {
        dummyHead = new Node();
        size = 0;
    }

//    private Node head;
//
//    private int size;
//
//    public LinkedList() {
//        head = null;
//        size = 0;
//    }

    /**
     * 获取链表中元素的个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 判断链表是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

//    /**
//     * 向链表头添加元素 不使用虚拟头节点 dummyhead
//     * @param e
//     */
//    public void addFirst(E e){
////        Node node = new Node(e);
////        node.next = head;
////        head = node;
//        head =new Node(e, head);
//        size++;
//

    //    }
    //

    public void add(int index, E e){
        if (index < 0 || index > size)
            throw new IllegalArgumentException("add faild, Illegal index");
//        if (index == 0){
//            addFirst(e);
//        }else {
//            Node prev = head;
//            for (int i = 0; i < index - 1; i++)
//                prev = prev.next;
////            Node node = new Node(e);
////            node.next = prev.next;
////            prev.next = node;
//           prev.next = new Node(e, prev.next);
//           size++;
//        }
        Node prev = dummyHead;
            for (int i = 0; i < index; i++)
                prev = prev.next;
           prev.next = new Node(e, prev.next);
           size++;
    }

    /**
     * 向链表头添加元素 使用虚拟头节点
     * @param e
     */
    public void addFirst(E e){
       add(0, e);
    }

    /**
     * 向链表尾部添加元素
     * @param e
     */
    public void addLast(E e){
        add(size, e);
    }

    /**
     *获取index位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get faild, Illegal index");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size - 1);
    }

    public void set(int index, E e){
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Set faild, Illegal index");
        Node cur = dummyHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.e = e;
    }

    public boolean contains(E e){
        Node cur = dummyHead.next;
        while (cur != null){
            if (cur.e.equals(e))
                return true;
            cur = cur.next;
        }

        return false;
    }


    public E remove(int index){
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("remove faild, Illegal index");
        Node prev = dummyHead;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;
        return retNode.e;
    }

    // 从链表中删除元素e
    public void removeElement(E e){

        Node prev = dummyHead;
        while(prev.next != null){
            if(prev.next.e.equals(e))
                break;
            prev = prev.next;
        }

        if(prev.next != null){
            Node delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size --;
        }
    }


    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }



    @Override
    public String toString(){

        StringBuilder builder = new StringBuilder();

//        Node cur = dummyHead.next;
//
//        while (cur != null){
//            builder.append(cur+"->");
//            cur = cur.next;
//        }
//
        for (Node cur = dummyHead.next; cur != null; cur = cur.next)
            builder.append(cur+"->");

        builder.append("Null");

        return builder.toString();
    }
}
