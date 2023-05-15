import q1072.Q1072;

public class Main {
    public static void main(String[] args) {
        Q1072 q1072 = new Q1072();
        int[][] matrix = {{0,0,0}, {0,0,1}, {1,1,0}};
        int result = q1072.maxEqualRowsAfterFlips(matrix);
        System.out.println(result);
    }
}
