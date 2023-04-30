package q1033;

public class Q1033 {
    public int[] numMovesStones(int a, int b, int c) {
        int first = a < b ? (Math.min(a, c)) : (Math.min(b, c));
        int second = a < b ? (a > c ? a : (Math.min(b, c))) : (a < c ? a : (Math.max(b, c)));
        int third = a > b ? (Math.max(a, c)) : (Math.max(b, c));

        int min = 0;
        int max = 0;
        if(second - first > 1) {
            min++;
            max += second - first - 1;
        }

        if(third - second > 1) {
            min++;
            max += third - second - 1;
        }

        if (second - first == 2 || third - second == 2) min = 1;

        return new int[]{min, max};
    }
}
