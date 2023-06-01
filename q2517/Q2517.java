package q2517;

import java.util.Arrays;

public class Q2517 {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int left = 0, right = (price[price.length-1] - price[0]) / (k - 1) + 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (f(mid, price) >= k) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int f(int d, int[] price) {
        int cnt = 1, pre = price[0];
        for (int p : price) {
            if (p >= pre + d) {
                ++cnt;
                pre = p;
            }
        }

        return cnt;
    }
}
