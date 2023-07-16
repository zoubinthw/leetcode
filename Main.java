import q0018.Q0018;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Q0018 q0018 = new Q0018();
        int target = 1000000000;
        int[] nums = {0,0,0,1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> lists = q0018.fourSum(nums, target);
        System.out.println(lists);
    }
}
