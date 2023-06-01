package q1130;

import java.util.Stack;

public class Q1130 {
    public int mctFromLeafValues(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(Integer.MAX_VALUE);
        int res = 0;
        for (int a : arr) {
            while (st.peek() < a) {
                res += st.pop() * (Math.min(st.peek(), a));
            }
            st.push(a);
        }

        while (st.size() > 2) {
            res += st.pop() * st.peek();
        }

        return res;
    }
}
