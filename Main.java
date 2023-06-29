import q1253.Q1253;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Q1253 q1253 = new Q1253();
        int up = 4, low = 7;
        int[] col = {2, 1, 2, 2, 1, 1, 1};
        List<List<Integer>> lists = q1253.reconstructMatrix(up, low, col);
        System.out.println(lists);
    }
}
