import q1638.Q1638;
import q2367.Q2367;

public class Main {
    public static void main(String[] args) {
        int diff = 4;
        int[] nums = {1, 2, 3, 5, 6, 9, 10, 11, 13, 15, 16, 17, 20, 21};
        final var q2367 = new Q2367();
        System.out.println(q2367.hashSetCount(nums, diff));
    }
}
