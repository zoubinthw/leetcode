import list.ListNode;
import q0143.Q0143;

public class Main {
    public static void main(String[] args) {
        int[] head = {1, 2, 3, 4, 5};
        ListNode listHead = ListNode.makeList(head);
        Q0143 q0143 = new Q0143();
        q0143.reorderList(listHead);
        while (listHead != null) {
            System.out.println(listHead.val);
            listHead = listHead.next;
        }
    }
}
