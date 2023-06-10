package q1170;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1170 {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int lenQ = queries.length;
        int lenW = words.length;
        int[] q = new int[lenQ];
        int[] w = new int[lenW];

        for (int i = 0; i < lenQ; ++i) {
            q[i] = f(queries[i]);
        }

        for (int i = 0; i < lenW; ++i) {
            w[i] = f(words[i]);
        }

        Arrays.sort(w);
        int[] ans = new int[lenQ];
        for (int i = 0; i < lenQ; ++i) {
            int num = q[i];
            int left = 0, right = lenW-1;
            int mid = left + (right - left) / 2;
            while (left <= right) {
                if (w[mid] > num) right = mid - 1;
                else left = mid + 1;
                mid = left + (right - left) / 2;
            }
            ans[i] = lenW-left;
        }

        return ans;
    }


    private int f(String str) {
        char min = 'z';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (min > c) {
                min = c;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map.get(min);
    }
}
