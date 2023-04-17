import q2409.Q2409;

public class Main {
    public static void main(String[] args) {
        final var q2409 = new Q2409();
        String arriveAlice = "10-01", leaveAlice = "10-31";
        String arriveBob = "11-01", leaveBob = "12-31";
        final var days = q2409.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        System.out.println(days);
    }
}
