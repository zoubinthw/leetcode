package q1027;

public class Q1027 {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][1001];

        int result = 0;

        for (int k = 1; k < n; ++k) {
            for (int j = 0; j < k; ++j) {
                int d = nums[k] - nums[j] + 500;
                dp[k][d] = dp[j][d] + 1;
                result = Math.max(dp[k][d], result);
            }
        }

        return result + 1;
    }
}
