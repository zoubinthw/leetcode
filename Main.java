import q1638.Q1638;

public class Main {
    public static void main(String[] args) {
        final var q1638 = new Q1638();
        String s = "abacd";
        String t = "bbcab";
        final var i = q1638.countSubstrings(s, t);
        System.out.println(i);
    }
}
