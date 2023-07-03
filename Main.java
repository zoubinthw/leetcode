import list.ListNode;
import q0445.Q0445;

public class Main {
    public static void main(String[] args) {
        Q0445 q0445 = new Q0445();
        int[] l1 = {7, 2, 4, 3};
        int[] l2 = {5, 6, 4};
        ListNode h1 = ListNode.makeList(l1);
        ListNode h2 = ListNode.makeList(l2);
        ListNode res = q0445.addTwoNumbers(h1, h2);

        System.out.println(res);
    }
}
