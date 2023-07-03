package list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public static ListNode makeList(int[] arr) {
        ListNode h = null, p = null;
        for (int a : arr) {
            if (h == null) {
                h = new ListNode(a);
                p = h;
            } else {
                p.next = new ListNode(a);
                p = p.next;
            }
        }

        return h;
    }
}
