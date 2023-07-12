package q1911;

public class Q1911 {
    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;
        long[] f = new long[len+1];
        long[] g = new long[len+1];
        f[0] = g[0] = 0;
        for (int i = 1; i <= len; ++i) {
            f[i] = Math.max(g[i-1] - nums[i-1], f[i-1]);
            g[i] = Math.max(f[i-1] + nums[i-1], g[i-1]);
        }

        return Math.max(f[len], g[len]);
    }
}
