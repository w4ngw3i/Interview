package com.wangwei.datastructure.leetcode;

/**
 * @Auther wangwei
 * @Date 2018/5/2 下午8:46
 */
public class Solution203_2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null){
            if (prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return dummyHead.next;
    }
}

