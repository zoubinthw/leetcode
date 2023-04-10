package q1019;

import list.ListNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Q1019 {
    public int[] nextLargerNodes(ListNode head) {
        // 暴力枚举
//        int i = 0;
//        ListNode start = head;
//        ListNode p = head.getNext();
//
//        int[] answer = new int[getListLength(head)];
//
//        while (p != null) {
//            while (p != null && p.getVal() <= start.getVal()) p = p.getNext();
//            answer[i++] = p != null ? p.getVal() : 0;
//            start = start.getNext();
//            p = start.getNext();
//        }
//
//        return answer;

        // 单调栈
        List<Integer> ans = new ArrayList<>();
        Deque<int[]> deque = new ArrayDeque<>();
        int index = 0;

        while (head != null) {
            int curVal = head.getVal();
            ans.add(0);
            while (!deque.isEmpty() && curVal > deque.peek()[0]) {
                ans.set(deque.pop()[1], curVal);
            }
            deque.push(new int[]{curVal, index++});
            head = head.getNext();
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private int getListLength(ListNode head) {
        int i = 0;
        while (head != null) {
            ++i;
            head = head.getNext();
        }

        return i;
    }

    public ListNode createList(int[] arr) {
        int len = arr.length;
        ListNode listNode = new ListNode();
        listNode.setVal(arr[len-1]);
        listNode.setNext(null);
        for (int i = len-2; i >= 0; --i) {
            final var node = new ListNode();
            node.setVal(arr[i]);
            node.setNext(listNode);
            listNode = node;
        }

        return listNode;
    }
}
