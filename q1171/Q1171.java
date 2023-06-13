package q1171;

import list.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Q1171 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        Map<Integer, ListNode> mp = new HashMap<>();
        dummy.next = head;
        ListNode cur = dummy;
        int preSum = 0;
        while (cur != null) {
            preSum = cur.val + preSum;
            mp.put(preSum, cur);
            cur = cur.next;
        }

        preSum = 0;
        cur = dummy;
        while (cur != null) {
            preSum = cur.val + preSum;
            cur.next = mp.get(preSum).next;
            cur = cur.next;
        }

        return dummy.next;
    }
}
