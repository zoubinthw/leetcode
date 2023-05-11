package q1016;

import java.util.HashSet;

public class Q1016 {
    public boolean queryString(String s, int n) {
        return method02(s, n);
    }

    // 简单的暴力搜索
    private boolean method01(String s, int n) {
        for (int i = 1; i <= n; ++i) {
            if (!s.contains(Integer.toBinaryString(i))) return false;
        }
        return true;
    }

    // 优化: 把s的子串专转换成二进制数，保存在set中，最后判断set的size==n
    private boolean method02(String s, int n) {
        HashSet<Integer> set = new HashSet<>();
        int m = s.length();
        for (int i = 0; i < m; i++) {
            int x = s.charAt(i) - '0';
            if (x == 0) continue;
            set.add(x);
            for (int j = i + 1; j < m; ++j) {
                x = (x << 1) | (s.charAt(j) - '0');
                if (x > n) break;
                set.add(x);
            }
        }

        return set.size() == n;
    }
}
