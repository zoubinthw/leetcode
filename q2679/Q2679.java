package q2679;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Q2679 {
    public int matrixSum(int[][] nums) {
        List<PriorityQueue<Integer>> pq = new ArrayList<>();
        int row = nums.length, col = nums[0].length;
        for (int[] num : nums) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });
            for (int j = 0; j < col; ++j) {
                queue.offer(num[j]);
            }
            pq.add(queue);
        }

        int res = 0;
        while (col > 0) {
            --col;
            int maxVal = 0;
            for (PriorityQueue<Integer> que : pq) {
                Integer val = que.poll();
                if (maxVal < val) {
                    maxVal = val;
                }
            }
            res += maxVal;
        }

        return res;
    }
}
