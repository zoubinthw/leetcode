package q0002;

import list.ListNode;

import java.util.List;

public class Q0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode h1 = l1, h2 = l2;
        ListNode res = null, p = null;
        while (h1 != null && h2 != null) {
            int num = h1.val + h2.val + carry;
            if (num > 9) {
                carry = 1;
                num = num % 10;
            } else {
                carry = 0;
            }
            if (res == null) {
                res = new ListNode(num);
                p = res;
            } else {
                p.next = new ListNode(num);
                p = p.next;
            }
            h1 = h1.next;
            h2 = h2.next;
        }

        if (h1 != null) {
            while (h1 != null) {
                int num = h1.val + carry;
                if (num > 9) {
                    num = num % 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                p.next = new ListNode(num);
                p = p.next;
                h1 = h1.next;
            }
        }

        if (h2 != null) {
            while (h2 != null) {
                int num = h2.val + carry;
                if (num > 9) {
                    num = num % 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                p.next = new ListNode(num);
                p = p.next;
                h2 = h2.next;
            }
        }

        if (carry > 0) {
            p.next = new ListNode(carry);
        }

        return res;
    }
}
