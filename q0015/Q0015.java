package q0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len-2 && nums[i] <= 0; ++i) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = len-1;
            while (j < k) {
                int x = nums[i] + nums[j] + nums[k];
                if (x > 0) {
                    k--;
                } else if (x < 0) {
                    ++j;
                } else {
                    res.add(List.of(nums[i], nums[j++], nums[k--]));
                    while (j < k && nums[j] == nums[j-1]) ++j;
                    while (j < k && nums[k] == nums[k+1]) --k;
                }
            }
        }

        return res;
    }
}
