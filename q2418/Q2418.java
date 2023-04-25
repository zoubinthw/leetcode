package q2418;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Q2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> nameHeight = new TreeMap<>();
        int n = names.length;
        for (int i = 0; i < n; ++i) {
            nameHeight.put(heights[i], names[i]);
        }
        ArrayList<String> result = new ArrayList<>(nameHeight.values());
        Collections.reverse(result);
        return result.toArray(new String[0]);
    }
}
