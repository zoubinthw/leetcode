package q1143;

public class Q1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int lenText1 = text1.length();
        int lenText2 = text2.length();
        if (lenText2 == 0 || lenText1 == 0) return 0;
        int[][] dp = new int[lenText1+1][lenText2+1];

        for (int i = 1; i <= lenText1; ++i) {
            char ch1 = text1.charAt(i-1);
            for (int j = 1; j <= lenText2; ++j) {
                char ch2 = text2.charAt(j-1);
                if (ch2 == ch1) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                  dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[lenText1][lenText2];
    }
}
