import q1170.Q1170;

public class Main {
    public static void main(String[] args) {
        Q1170 q1170 = new Q1170();
        String[] quires = {"bbb", "cc"};
        String[] words = {"a","aa","aaa","aaaa"};
        int[] res = q1170.numSmallerByFrequency(quires, words);
        for (int re : res) {
            System.out.print(re + " ");
        }

        System.out.println();
    }
}
