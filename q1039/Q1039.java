package q1039;

import java.util.Arrays;

public class Q1039 {
    private int[] v;
    private int[][] map;
    public int minScoreTriangulation(int[] values) {
        v = values;
        map = new int[v.length][v.length];
        for (int i = 0; i < v.length; ++i) {
            Arrays.fill(map[i], -1);
        }

        return dfs(0, v.length-1);
    }

    private int dfs(int i, int j) {
        if (i + 1 == j) return 0;
        if (map[i][j] > -1) return map[i][j];
        int result = Integer.MAX_VALUE;
        for (int k = i+1; k < j; ++k) {
            result = Math.min(result, dfs(i, k) + dfs(k, j) + v[i] * v[j] * v[k]);
        }
        return map[i][j] = result;
    }
}
