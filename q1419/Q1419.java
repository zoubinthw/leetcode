package q1419;

import java.util.HashMap;
import java.util.Map;

public class Q1419 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if (croakOfFrogs.length() % 5 != 0) return -1;
        int[] cnt = new int[4];
        Map<Character, Integer> map = new HashMap<>(){{
            put('c', 0);
            put('r', 1);
            put('o', 2);
            put('a', 3);
            put('k', 4);
        }};

        int result = 0, frogNum = 0;
        for (char ch : croakOfFrogs.toCharArray()) {
            Integer alphaNum = map.get(ch);
            if (alphaNum == 0) {
                cnt[alphaNum]++;
                frogNum++;
                if (frogNum > result) {
                    result = frogNum;
                }
            } else {
                if (cnt[alphaNum-1] == 0) return -1;
                cnt[alphaNum-1]--;
                if (alphaNum == 4) {
                    frogNum--;
                } else {
                    cnt[alphaNum]++;
                }
            }
        }

        if (frogNum > 0) return -1;
        return result;
    }
}
