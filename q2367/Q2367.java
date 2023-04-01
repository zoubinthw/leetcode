package q2367;

import java.util.HashSet;

public class Q2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;

        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] > nums[i] + diff) break;
                if (nums[j] == nums[i] + diff) {
                    for (int k = j + 1; k < nums.length; ++k) {
                        if (nums[k] > nums[j] + diff) break;
                        if (nums[k] == nums[j] + diff) {
                            result++;
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }

    public int hashSetCount(int[] nums, int diff) {
        int result = 0;
        final var numsSet = new HashSet<Integer>();
        for (int num : nums) {
            numsSet.add(num);
        }

        for (int num : nums) {
            if (numsSet.contains(num + diff) && numsSet.contains(num + 2 * diff)) {
                result ++;
            }
        }

        return result;
    }
}
