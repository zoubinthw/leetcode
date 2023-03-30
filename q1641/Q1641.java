package q1641;

import java.util.Arrays;

public class Q1641 {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        for (int i = 0; i < 5; ++i) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; ++i) {
            dp[i][0] = dp[i-1][0];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
            dp[i][2] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2];
            dp[i][3] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + + dp[i-1][3];
            dp[i][4] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + + dp[i-1][3] + dp[i-1][4];
        }

        int result = 0;

        for (int i = 0; i < 5; ++i) {
            result += dp[n-1][i];
        }

        return result;
    }

    public int countVowelStrings2(int n) {
        int[][] dp = new int[n][5];
        for (int i = 0; i < 5; ++i) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < n; ++i) {
            dp[i][0] = dp[i-1][0];
            for (int j = 1; j < 5; ++j) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }

        int result = 0;

        for (int i = 0; i < 5; ++i) {
            result += dp[n-1][i];
        }

        return result;
    }

    public int countVowelStrings3(int n) {
        int[] dp = {1, 1, 1, 1, 1};

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < 5; ++j) {
                dp[j] = dp[j] + dp[j-1];
            }
        }
        return Arrays.stream(dp).sum();
    }
}
