import q1177.Q1177;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Q1177 q1177 = new Q1177();
        String s = "abcda";
        int[][] quires = {{3,3,0},{1,2,0},{0,3,1},{0,3,2},{0,4,1}};
        List<Boolean> res = q1177.canMakePaliQueries(s, quires);
        for (Boolean re : res) {
            System.out.print(re + " ");
        }

        System.out.println();
    }
}
