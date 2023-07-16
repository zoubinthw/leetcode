package q0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) return res;
        //0 1 2 3 4
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i < len-3; ++i) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if ((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            if ((long)nums[i] + nums[len-3] + nums[len-2] + nums[len-1] < target) continue;

            for (int j = i + 1; j < len-2; ++j) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                if ((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
                if ((long)nums[i] + nums[j] + nums[len-2] + nums[len-1] < target) continue;
                int left = j+1, right = len-1;
                while (left < right) {
                    long num = nums[i] + nums[j] + nums[left] + nums[right];
                    if (num == target) {
                        int[] arr = {nums[i], nums[j], nums[left++], nums[right--]};
                        res.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
                        while (left < right && nums[left] == nums[left-1]) ++left;
                        while (left < right && nums[right] == nums[right+1]) --right;
                    } else if (num > target) {
                        --right;
                    } else {
                        ++left;
                    }
                }
            }
        }

        return res;
    }
}


//class Solution {
//    public List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
//        if (nums == null || nums.length < 4) {
//            return quadruplets;
//        }
//        Arrays.sort(nums);
//        int length = nums.length;
//        for (int i = 0; i < length - 3; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
//                break;
//            }
//            if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
//                continue;
//            }
//            for (int j = i + 1; j < length - 2; j++) {
//                if (j > i + 1 && nums[j] == nums[j - 1]) {
//                    continue;
//                }
//                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
//                    break;
//                }
//                if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
//                    continue;
//                }
//                int left = j + 1, right = length - 1;
//                while (left < right) {
//                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
//                    if (sum == target) {
//                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
//                        while (left < right && nums[left] == nums[left + 1]) {
//                            left++;
//                        }
//                        left++;
//                        while (left < right && nums[right] == nums[right - 1]) {
//                            right--;
//                        }
//                        right--;
//                    } else if (sum < target) {
//                        left++;
//                    } else {
//                        right--;
//                    }
//                }
//            }
//        }
//        return quadruplets;
//    }
//}