package q1031;

public class Q1031 {
    private int[] nums;
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        this.nums = nums;
        int[] preSum = preSum(this.nums);
        int a = maxSubArraySum(firstLen, preSum);
        int b = maxSubArraySum(secondLen, preSum);
        return a + b;
    }

    private int maxSubArraySum(int len, int[] preSum) {
        int n = preSum.length;
        int result = preSum[len-1];
        int start = 0;
        int end = len-1;
        for (int i = len; i < n; ++i) {
            if (nums[i] > -1 && nums[i-len] > -1) {
                int max = preSum[i] - preSum[i-len];
                if (max > result) {
                    end = i;
                    start = i - len + 1;
                    result = max;
                }
            }
        }
        mark(nums, start, end);
        return result;
    }

    private void mark(int[] nums, int start, int end) {
        for (int i = start; i <= end; ++i) {
            nums[i] = -1;
        }
    }

    private int[] preSum(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = nums[0];
        for (int i = 1; i < n; ++i) {
            result[i] = result[i-1] + nums[i];
        }

        return result;
    }
}
