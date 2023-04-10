import list.ListNode;
import q1019.Q1019;

public class Main {
    public static void main(String[] args) {
        final var q1019 = new Q1019();
        int[] arr = {2, 7, 4, 3, 5};
        ListNode head = q1019.createList(arr);
        final var answer = q1019.nextLargerNodes(head);
        for (int ans : answer) {
            System.out.println(ans);
        }
    }
}
