import q1017.Q1017;
import q2399.Q2399;

public class Main {
    public static void main(String[] args) {
        final var q2399 = new Q2399();
        String s = "abaccb";
        int[] distance = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(q2399.checkDistances(s, distance));
    }
}
