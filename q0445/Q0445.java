package q0445;

import list.ListNode;

public class Q0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverseList(l1);
        ListNode h2 = reverseList(l2);
        ListNode res = null;
        int carry = 0;
        while (h1 != null || h2 != null) {
            int hn1 = h1 == null ? 0 : h1.val;
            int hn2 = h2 == null ? 0 : h2.val;
            int sum = hn1 + hn2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode node = new ListNode(sum);
            if (res != null) {
                node.next = res;
            }
            res = node;
            h1 = h1 == null ? null : h1.next;
            h2 = h2 == null ? null : h2.next;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            node.next = res;
            res = node;
        }

        return res;
    }

    private ListNode reverseList(ListNode head) {
        ListNode h = null;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            if (h != null) {
                node.next = h;
            }
            h = node;
            head = head.next;
        }
        return h;
    }
}
