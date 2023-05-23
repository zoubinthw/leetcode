import q1073.Q1073;
import q1090.Q1090;

public class Main {
    public static void main(String[] args) {
        int[] values = {9,8,8,7,6};
        int[] labels = {0,0,0,1,1};
        int numWanted = 3, useLimit = 1;
        Q1090 q1090 = new Q1090();
        int res = q1090.largestValsFromLabels(values, labels, numWanted, useLimit);
        System.out.println(res);
    }
}
