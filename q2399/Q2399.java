package q2399;

import java.util.HashMap;
import java.util.HashSet;

public class Q2399 {
    public boolean checkDistances(String s, int[] distance) {
        char ch = 'a';
        final var diffMap = new HashMap<Character, Integer>();
        for (int i = 0; i < 26; ++i) {
            diffMap.put(ch++, 0);
        }

        for (int i = 1; i < s.length(); ++i) {
            final var distValue = diffMap.get(s.charAt(i));
            if (distValue == 0 && s.charAt(i) != s.charAt(0)) {
                diffMap.put(s.charAt(i), i);
            } else {
                final var countDist = i - distValue - 1;
                final var realDist = distance[s.charAt(i) - 'a'];
                if (realDist != countDist) {
                    return false;
                }
                diffMap.put(s.charAt(i), countDist);
            }
        }

        return true;
    }
}
