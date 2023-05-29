package q1079;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q1079 {
    public int numTilePossibilities(String tiles) {
//        Map<Character, Integer> count = new HashMap<>();
//        for (char t : tiles.toCharArray()) {
//            count.put(t, count.getOrDefault(t, 0) + 1);
//        }
//        Set<Character> tile = new HashSet<>(count.keySet());
//        return dfs(tiles.length(), count, tile) - 1;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : tiles.toCharArray()) {
//            int cnt = map.getOrDefault(ch, 0);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        Set<Character> set = new HashSet<>(map.keySet());
        return dfs(tiles.length(), map, set) - 1;
    }

    private int dfs(int i, Map<Character, Integer> count, Set<Character> tile) {
//        if (i == 0) {
//            return 1;
//        }
//        int res = 1;
//        for (char t : tile) {
//            if (count.get(t) > 0) {
//                count.put(t, count.get(t) - 1);
//                res += dfs(i - 1, count, tile);
//                count.put(t, count.get(t) + 1);
//            }
//        }
//        return res;

        if (i == 0) return 1;
        int ans = 1;
        for (char t : tile) {
//            Integer cnt = count.get(t); // 这样写，在 count.put(t, cnt + 1); 相当于在原有基础上又+1了
            if (count.get(t) > 0) {
//                count.put(t, cnt - 1);
                count.put(t, count.get(t) - 1);
                ans += dfs(i - 1, count, tile);
//                count.put(t, cnt + 1);
                count.put(t, count.get(t) + 1);
            }
        }

        return ans;
    }
}
