import q1053.Q1053;
import q1638.Q1638;
import q2367.Q2367;

public class Main {
    public static void main(String[] args) {
        final var q1053 = new Q1053();
        int[] arr = {1,1,5};
        int[] result = q1053.prevPermOpt1(arr);
        for (int num:
             result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
