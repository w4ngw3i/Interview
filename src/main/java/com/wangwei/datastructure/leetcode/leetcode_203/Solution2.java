package com.wangwei.datastructure.leetcode.leetcode_203;

import com.wangwei.datastructure.leetcode.ListNode;

/**
 * @Auther wangwei
 * @Date 2018/5/2 下午8:46
 */
public class Solution2 {
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

    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 3, 3, 4, 6, 5, 6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);

        ListNode res = new Solution2().removeElements(listNode, 6);
        System.out.println(res);
    }
}

