package q1289;

import java.util.Arrays;

public class Q1289 {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int res = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        for (int i = 0; i < n; ++i) {
            dfs(dp, grid, i, 0, n);
        }
        for (int ans : dp[0]) {
            res = Math.min(res, ans);
        }
        return res;
    }

    private int dfs(int[][] dp, int[][] grid, int col, int row, int n) {
        if (dp[row][col] > Integer.MIN_VALUE) return dp[row][col];
        if (row == n-1) {
            dp[row][col] = grid[row][col];
            return dp[row][col];
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (i == col) continue;
            int minSum = dfs(dp, grid, i, row + 1, n);
            res = Math.min(res, minSum + grid[row][col]);
        }

        dp[row][col] = res;
        return dp[row][col];
    }


}
