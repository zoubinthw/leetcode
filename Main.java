import q1053.Q1053;

public class Main {
    public static void main(String[] args) {
        final var q1053 = new Q1053();
        int[] arr = {3,1,1,3};
        int[] result = q1053.prevPermOpt1(arr);
        for (int num:
             result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
