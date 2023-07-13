import q0931.Q0931;

public class Main {
    public static void main(String[] args) {
        Q0931 q0931 = new Q0931();
        int[][] matrix = {{2,1,3}, {6,5,4}, {7,8,9}};
//        int[][] matrix = {{-19, 57}, {-40, -5}};
        System.out.println(q0931.minFallingPathSum(matrix));
    }
}
