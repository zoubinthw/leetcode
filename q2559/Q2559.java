package q2559;

import java.util.HashSet;
import java.util.Set;

public class Q2559 {
    private static final Set<Character> st = new HashSet<>(){{
        add('a');
        add('e');
        add('i');
        add('o');
        add('u');
    }};
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len = words.length;
        int[] cnt = new int[len + 1];
        cnt[0] = 0;
        for (int i = 1; i <= len; ++i) {
            if (isVowelStr(words[i-1])) {
                cnt[i] = cnt[i-1] + 1;
            } else {
                cnt[i] = cnt[i-1];
            }
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = cnt[end + 1] - cnt[start];
        }

        return ans;
    }

    private boolean isVowelStr(String str) {
        return str != null && st.contains(str.charAt(0)) && st.contains(str.charAt(str.length()-1));
    }
}
