package q0918;

public class Q0918 {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length;
        int[] leftMax = new int[len];

        int res = nums[0];
        int pre = nums[0];

        int leftSum = nums[0];
        leftMax[0] = nums[0];
        for (int i = 1; i < len; ++i) {
            pre = Math.max(pre + nums[i], nums[i]);
            res = Math.max(res, pre);
            leftSum += nums[i];
            leftMax[i] = Math.max(leftMax[i-1], leftSum);
        }

        int rightSum = 0;
        for (int i = len-1; i > 0; --i) {
            rightSum += nums[i];
            res = Math.max(res, rightSum + leftMax[i-1]);
        }

        return res;
    }
}
