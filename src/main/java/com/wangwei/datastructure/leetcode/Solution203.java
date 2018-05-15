package com.wangwei.datastructure.leetcode;

/**
 * @Auther wangwei
 * @Date 2018/5/2 下午5:47
 * 删除链表中等于给定值 val 的所有节点。
示例:
输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val){
//            ListNode delNode = head;
//            head = head.next;
//            delNode.next = null;
            head = head.next;
        }

        if (head == null)
            return null;

        ListNode prev = head;
        while (prev.next != null){
            if (prev.next.val == val){
//                ListNode delNode = prev.next;
//                prev.next = delNode.next;
//                delNode.next = null;
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }

        return head;
    }
}
