package q2413;

public class Q2413 {
    public int smallestEvenMultiple(int n) {
        return lcm(2, n);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
