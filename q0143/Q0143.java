package q0143;

import list.ListNode;

public class Q0143 {
    public void reorderList(ListNode head) {
        int cnt = totalNodes(head);
        if (cnt < 3) return;

        int index = cnt / 2 + cnt % 2 - 1;
        ListNode midNode = middleNode(head, index);

        ListNode nextPartHead = midNode.next;
        midNode.next = null;
        nextPartHead = reverseList(nextPartHead);

        insertList(head, nextPartHead);
    }

    private void insertList(ListNode head, ListNode nextPartHead) {
        while (head != null && nextPartHead != null) {
            ListNode tmp = nextPartHead;
            nextPartHead = nextPartHead.next;
            tmp.next = head.next;
            head.next = tmp;
            head = tmp.next;
        }
    }

    private ListNode reverseList(ListNode nextPartHead) {
        ListNode head = null;
        while (nextPartHead != null) {
            ListNode tmp = nextPartHead;
            nextPartHead = nextPartHead.next;
            tmp.next = head;
            head = tmp;
        }
        return head;
    }

    private int totalNodes(ListNode head) {
        int cnt = 0;
        while (head != null) {
            ++cnt;
            head = head.next;
        }
        return cnt;
    }

    private ListNode middleNode(ListNode head, int middleIndex) {
        while (middleIndex > 0) {
            head = head.next;
            --middleIndex;
        }

        return head;
    }
}
