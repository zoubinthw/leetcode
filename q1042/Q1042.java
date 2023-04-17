package q1042;

import java.util.ArrayList;
import java.util.List;

public class Q1042 {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<Integer>[] obj = new List[n];
        System.gc();
        for (int i = 0; i < n; ++i) {
            obj[i] = new ArrayList<>();
        }

        for (int[] path : paths) {
            obj[path[0] - 1].add(path[1] - 1);
            obj[path[1] - 1].add(path[0] - 1);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            boolean[] colors = new boolean[5];
            for (int vertex : obj[i]) {
                colors[ans[vertex]] = true;
            }

            for (int j = 1; j < 5; ++j) {
                if (!colors[j]) {
                    ans[i] = j;
                    break;
                }
            }
        }

        return ans;
    }
}
