import q2559.Q2559;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {9,5,7,8,7,9,8,2,0,7};
        int len = nums.length;
        Arrays.sort(nums);
        Set<Double> st = new HashSet<>();
        int i = 0, j = len-1;
        while(i < j) {
            double n = (nums[i] + nums[j]) * 1.0 / 2;
            st.add(n);
            ++i;
            --j;
        }
        System.out.println(st.size());
    }
}
