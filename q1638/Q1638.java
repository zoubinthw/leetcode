package q1638;

public class Q1638 {
    // 枚举
    public int countSubstrings(String s, String t) {
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = 0; j < t.length(); ++j) {
                int k = 0;
                int diff = 0;
                while (i + k < s.length() && j + k < t.length()) {
                    if (strS[i + k] != strT[j + k]) diff++;
                    if (diff > 1) break;
                    ++k;
                    if (diff == 1) ++result;
                }
            }
        }

        return result;
    }

    // 1.动态规划, 定义s[i], t[j]分别是字符串s和字符串t中位置i和j处不同的字符
    // 2.1定义dpl[i][j]为从左开始,以s[i],t[j]结尾的子字符串的最长公共字串
    // 2.2定义dpr[i][j]为从右开始,以s[i],t[j]结尾的子字符串的最长公共字串
    // 2.3则由这两组公共字串构成的满足题目条件的字串个数为(dpl[i][j]+1)x(dpr[i][j]+1)
    // 3.则找到全部符合条件的s[i], t[j]并计算最长公共字串即可求出答案
    public int dpCountSubstrings(String s, String t) {
        int result = 0;
        return result;
    }
}
