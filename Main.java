import list.ListNode;
import q0002.Q0002;

public class Main {
    public static void main(String[] args) {
        Q0002 q0002 = new Q0002();
        int[] l1 = {9, 9, 9, 9, 9, 9, 9};
        int[] l2 = {9, 9, 9, 9};
        ListNode h1 = makeList(l1);
        ListNode h2 = makeList(l2);

        ListNode res = q0002.addTwoNumbers(h1, h2);
        System.out.println(res);
    }

    private static ListNode makeList(int[] arr) {
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
