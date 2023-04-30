import q1033.Q1033;

public class Main {
    public static void main(String[] args) {
        Q1033 q1033 = new Q1033();
        int a = 3, b = 5, c = 1;
        int[] res = q1033.numMovesStones(a, b, c);
        for (int re : res) {
            System.out.printf("%d ", re);
        }
        System.out.println();
    }
}
