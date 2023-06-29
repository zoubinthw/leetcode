package q1186;

import java.util.Arrays;

public class Q1186 {
    private int[] arr;
    private int[][] mem;
    public int maximumSum(int[] arr) {
        this.arr = arr;
        int length = arr.length;
        this.mem = new int[length][2];
        for (int i = 0; i < length; ++i) {
            Arrays.fill(this.mem[i], Integer.MIN_VALUE);
        }
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < length; ++i) {
            ans = Math.max(ans, Math.max(dfs(i, 0), dfs(i, 1)));
        }
        return ans;
    }

    private int dfs(int i, int j) {
        if (i < 0) return Integer.MIN_VALUE / 2;
        if (mem[i][j] != Integer.MIN_VALUE) return mem[i][j];
        if (j == 0) {
            mem[i][j] = Math.max(dfs(i-1, 0) + this.arr[i], this.arr[i]);
//            mem[i][j] = Math.max(dfs(i-1, 0) , 0) + this.arr[i];
        } else {
            mem[i][j] = Math.max(dfs(i-1, 0), dfs(i-1, 1) + this.arr[i]);
        }
        return mem[i][j];
    }
}
