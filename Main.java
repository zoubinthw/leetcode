import q1289.Q1289;

public class Main {
    public static void main(String[] args) {
        Q1289 q1289 = new Q1289();
        int[][] grid = {{7}};
//        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(q1289.minFallingPathSum(grid));
    }
}
