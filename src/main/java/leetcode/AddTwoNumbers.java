package leetcode;

/**
 * Created by xuliang.sxl on 2015/11/25.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode node = head;
        while(l1!=null && l2 !=null) {
            int sum = l1.val + l2.val + carry;
            node.next = new ListNode(sum %10);
            carry = sum /10;
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 !=null) {
            int sum = l1.val + carry;
            node.next = new ListNode(sum %10);
            carry = sum /10;
            node = node.next;
            l1 = l1.next;
        }

        while(l2 !=null) {
            int sum = l2.val + carry;
            node.next = new ListNode(sum %10);
            carry = sum /10;
            node = node.next;
            l2 = l2.next;
        }

        if(carry != 0) {
            node.next = new ListNode(carry);
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}