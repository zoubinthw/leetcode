package q2352;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2352 {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;
//        for (int[] row : grid) {
//            for (int j = 0; j < n; ++j) {
//                boolean flag = true;
//                for (int k = 0; k < n; ++k) {
//                    if (row[k] != grid[k][j]) {
//                        flag = false;
//                        break;
//                    }
//                }
//
//                if (flag) {
//                    ++ans;
//                }
//            }
//        }
//
        Map<String, Integer> map = new HashMap<>();
        for (int[] row : grid) {
            String numStr = Arrays.toString(row);
            map.put(numStr, map.getOrDefault(numStr, 0) + 1);
        }

        for (int i = 0; i < n; ++i) {
            int[] nums = new int[n];
            for (int j = 0; j < n; ++j) {
                nums[j] = grid[j][i];
            }
            String numStr = Arrays.toString(nums);
            ans += map.getOrDefault(numStr, 0);
        }
        return ans;

    }
}
