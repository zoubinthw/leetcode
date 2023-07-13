package q0931;

import java.util.Arrays;

public class Q0931 {
    private int n = 0;
    private int[][] matrix = null;

    private int[][] mp = null;
    public int minFallingPathSum(int[][] matrix) {
        this.n = matrix.length;
        mp = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(mp[i], Integer.MAX_VALUE);
        }
        this.matrix = matrix;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            res = Math.min(dfs(0, i), res);
        }

        return res;
    }

    private int dfs(int curRow, int curCol) {
        if (this.mp[curRow][curCol] < Integer.MAX_VALUE) return this.mp[curRow][curCol];
        int leftX = curCol-1, rightX = curCol+1;
        int nextRow = curRow+1;
        if (nextRow >= n) {
            mp[curRow][curCol] = this.matrix[curRow][curCol];
            return mp[curRow][curCol];
        };
        int a = leftX >= 0 ? dfs(nextRow, leftX) : Integer.MAX_VALUE;
        int b = dfs(nextRow, curCol);
        int c = rightX < n ? dfs(nextRow, rightX) : Integer.MAX_VALUE;
        mp[curRow][curCol] = this.matrix[curRow][curCol] + Math.min(a, Math.min(b, c));
        return mp[curRow][curCol];
    }
}
