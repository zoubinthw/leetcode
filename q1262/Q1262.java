package q1262;

import java.util.Arrays;

public class Q1262 {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][3];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(dp[i], -1);
        }

        return dfs(dp, nums, n-1, 0);
    }

    private int dfs(int[][] dp, int[] nums, int i, int j) {
        if (i == -1) return j == 0 ? 0 : Integer.MIN_VALUE;
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = Math.max(dfs(dp, nums, i-1, j), dfs(dp, nums, i-1,(j+3-nums[i]%3)%3) + nums[i]);
    }
}
