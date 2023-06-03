package q1156;

import java.util.Map;

public class Q1156 {
    public int maxRepOpt1(String text) {
        int ans = 0, len = text.length();
        int[] map = new int[26];
        for (int i = 0; i < len; ++i) {
            map[text.charAt(i) - 'a']++;
        }

        int i = 0;
        while (i < len) {
            int j = i;
            while (j < len && text.charAt(j) == text.charAt(i)) ++j;
            int l = j - i;
            int k = j + 1;
            while (k < len && text.charAt(k) == text.charAt(i)) ++k;
            int r = k - j - 1;
            ans = Math.max(ans, Math.min(l + r + 1, map[text.charAt(i) - 'a']));
            i = j;
        }

        return ans;
    }
}
