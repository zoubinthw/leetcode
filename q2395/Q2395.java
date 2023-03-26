package q2395;

public class Q2395 {
    public boolean solution(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        final var subArraySum = new int[nums.length-1];
        for (int i = 0; i < nums.length-1; ++i) {
            subArraySum[i] = nums[i] + nums[i+1];
        }
        qsort(subArraySum, 0, subArraySum.length-1);

        for (int i = 0; i < subArraySum.length-1; ++i) {
            if (subArraySum[i] == subArraySum[i+1]) {
                return true;
            }
        }

        return false;
    }

    private void qsort(int[] num, int start, int end){
        if (start >= end) return;
        int tmp = num[start];
        int initStart = start;
        int initEnd = end;
        ++start;
        while (start <= end) {
            while (start <= end && num[end] >= tmp) --end;
            while (start <= end && num[start] <= tmp) ++start;
            if (start < end) {
                swap(num, start++, end--);
            }
        }
        swap(num, initStart, end);
        qsort(num, initStart, end-1);
        qsort(num, end+1, initEnd);
    }

    private void swap(int[] num, int left, int right) {
        int tmp = num[left];
        num[left] = num[right];
        num[right] = tmp;
    }
}
