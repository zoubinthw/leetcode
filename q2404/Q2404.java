package q2404;

import java.util.HashMap;

public class Q2404 {
    public int mostFrequentEven(int[] nums) {
        final var map = new HashMap<Integer, Integer>();

        for (int num : nums) {
            if (num % 2 == 0) {
                final var count = map.getOrDefault(num, 0);
                map.put(num, count + 1);
            }
        }

        if (map.size() < 1) return -1;

        int minNumber = 100002;
        int maxCount = 0;

        for (Integer key : map.keySet()) {
            final var value = map.get(key);
            if ((value > maxCount) || (value == maxCount && key < minNumber)) {
                minNumber = key;
                maxCount = value;
            }
        }

        return minNumber;
    }
}
