package q2441;

import java.util.HashMap;
import java.util.Map;

public class Q2441 {
    public int findMaxK(int[] nums) {
        int res = -1;
        Map<Integer, int[]> map = new HashMap<>();
        for (int num : nums) {
            int key = Math.abs(num);
            int[] values = map.get(key);
            if (values == null) {
                values = new int[2];
                if (num > 0) {
                    values[0] = num;
                } else {
                    values[1] = num;
                }
            } else {
                if (num > 0 && values[1] != 0) {
                    values[0] = num;
                    if (key > res) res = key;
                } else if (num < 0 && values[0] != 0) {
                    values[1] = num;
                    if (key > res) res = key;
                }
            }
            map.put(key, values);
        }
        return res;
    }
}
