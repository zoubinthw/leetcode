package q1147;

public class Q1147 {
    public int longestDecomposition(String text) {
        if (text.isEmpty()) {
            return 0;
        }

        for (int i = 1, n = text.length(); i <= n / 2; ++i) {
            if (text.substring(0, i).equals(text.substring(n - i))) {
                return 2 + longestDecomposition(text.substring(i, n-i));
            }
        }

        return 1;
    }
}
