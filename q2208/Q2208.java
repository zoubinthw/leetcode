package q2208;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q2208 {
    public int halveArray(int[] nums) {
        int ans = 0;
        Queue<Double> dq = new PriorityQueue<>(Comparator.reverseOrder());
        double sum = 0;
        for (int ele : nums) {
            sum += ele;
            dq.offer(ele * 1.0);
        }
        double target = sum / 2.0;

        while (sum > target && !dq.isEmpty()) {
            ans += 1;
            Double ele = dq.poll();
            double res = ele / 2.0;
            dq.offer(res);
            sum -= res;
        }

        return ans;
    }
}
