package q1043;

public class Q1043 {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n+1];
        for (int i = 1; i <= n; ++i) {
            int maxVal = arr[i-1];
            for (int j = i-1; j >= i-k && j >= 0; --j) {
                dp[i] = Math.max(dp[i], dp[j] + (i-j) * maxVal);
                if (j > 0) {
                    maxVal = Math.max(maxVal, arr[j-1]);
                }
            }
        }

        return dp[n];
    }
}
