package q2611;

import java.util.*;

public class Q2611 {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;
        if (n == k) {
            return Arrays.stream(reward1).sum();
        }
        Integer[] diff = new Integer[n];
        int sum = Arrays.stream(reward2).sum();
        for (int i = 0; i < n; ++i) {
            diff[i] = reward1[i] - reward2[i];
        }
        Arrays.sort(diff, (a, b) -> b - a);

        int diffSum = 0;
        for (int i = 0; i < n; ++i) {
            if (k > 0) {
                --k;
                diffSum += diff[i];
            } else break;
        }

        return sum + diffSum;
    }
}
