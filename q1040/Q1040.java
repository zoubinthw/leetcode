package q1040;

import java.util.Arrays;

public class Q1040 {
    public int[] numMovesStonesII(int[] stones) {
        int len = stones.length;
        Arrays.sort(stones);
        if (stones[len - 1] - stones[0] + 1 == len) {
            return new int[]{0, 0};
        }
        int max = Math.max(stones[len-1] - stones[1] + 1 - len + 1,
                stones[len-2] - stones[0] + 1 - len + 1);

        int min = len;
        for (int i = 0, j = 0; i < len && j + 1 < len; ++i) {
            while (j + 1 < len && stones[j+1] - stones[i] + 1 <= len) {
                ++j;
            }
            if (j - i + 1 == len - 1 && stones[j] - stones[i] + 1 == len - 1) {
                min = Math.min(min, 2);
            } else {
                min = Math.min(min, len - (j - i + 1));
            }
        }


        return new int[]{max, min};
    }
}
