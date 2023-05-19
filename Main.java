import q1073.Q1073;

public class Main {
    public static void main(String[] args) {
        Q1073 q1073 = new Q1073();
        int[] arr1 = {0};
        int[] arr2 = {1};
        int[] ans = q1073.addNegabinary(arr1, arr2);
        for (int i = 0; i < ans.length-1; ++i) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(ans[ans.length-1]);
    }
}
