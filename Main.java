import q2559.Q2559;

public class Main {
    public static void main(String[] args) {
        Q2559 q2559 = new Q2559();
        String[] words = {"a","e","i"};
        int[][] queries = {{0,2},{0,1},{2,2}};
        int[] ints = q2559.vowelStrings(words, queries);
        for (int it :ints){
            System.out.print(it + " ");
        }

        System.out.println();
    }
}
