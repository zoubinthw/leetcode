import q1031.Q1031;
import q2409.Q2409;
import q2418.Q2418;

public class Main {
    public static void main(String[] args) {
        Q1031 q1031 = new Q1031();
        int firstLen = 1;
        int secondLen = 2;
        int[] nums = {0,6,5,2,2,5,1,9,4};
        q1031.maxSumTwoNoOverlap(nums, firstLen, secondLen);
    }
}
