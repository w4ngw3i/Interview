package com.wangwei.datastructure.leetcode.leetcode_203;

import com.wangwei.datastructure.leetcode.ListNode;

/**
 * @Auther wangwei
 * @Date 2018/5/27 下午5:20
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val){
        if (head == null)
            return null;
//        ListNode res = removeElements(head.next, val);
//
//        if (head.val == val)
//            return res;
//        else{
//            head.next = res;
//            return head;
//        }
        head.next = removeElements(head.next, val);
//        if (head.val == val)
//            return head.next;
//        else
//            return head;
        return head.val == val? head.next: head;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,6,7,3,5,3,9};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = new Solution3().removeElements(head, 3);
        System.out.println(res);

    }
}
