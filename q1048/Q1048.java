package q1048;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q1048 {
    public int longestStrChain(String[] words) {
        int res = 0;
        Map<String, Integer> dp = new HashMap<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));

        for (String word : words) {
            dp.put(word, 1);
            for (int i = 0; i < word.length(); ++i) {
                String prefix = word.substring(0, i) + word.substring(i + 1);
                if (dp.containsKey(prefix)) {
                    dp.put(word, Math.max(dp.get(word), dp.get(prefix) + 1));
                }
            }
            res = Math.max(res, dp.get(word));
        }

        return res;
    }
}
