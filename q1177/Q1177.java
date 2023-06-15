package q1177;

import java.util.*;

public class Q1177 {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int len = s.length(), preSum = 0;
        int[][] preSumArr = new int[len+1][26];
        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            System.arraycopy(preSumArr[i], 0, preSumArr[i + 1], 0, 26);
            ++preSumArr[i+1][ch-'a'];
        }

        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            int left = query[0], right = query[1], k = query[2];
            int oddNum = 0;
            for (int i = 0; i < 26; ++i) {
                int alphaNum = preSumArr[right+1][i] - preSumArr[left][i];
                if (alphaNum % 2 != 0) {
                    ++oddNum;
                }
            }
            res.add(oddNum / 2 <= k);
        }

        return res;
    }

    private Boolean isPalindrome(String str, int k) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : str.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int oddNum = 0;
        for (Character ch : mp.keySet()) {
            Integer numberOfCh = mp.get(ch);
            if (numberOfCh % 2 != 0) {
                ++oddNum;
            }
        }

        int minRes = oddNum / 2;
        return minRes <= k;
    }
}
