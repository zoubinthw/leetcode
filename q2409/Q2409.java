package q2409;

public class Q2409 {
    private final static int[] daySums = new int[13];
    private final static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static {
        daySums[1] = 0;
        for (int i = 2; i < 13; ++i) {
            daySums[i] = daySums[i-1] + days[i-2];
        }
    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aliceArrive = getDayCounts(arriveAlice);
        int aliceLeave = getDayCounts(leaveAlice);
        int bobArrive = getDayCounts(arriveBob);
        int bobLeave = getDayCounts(leaveBob);
        int firstLeave = Math.min(aliceLeave, bobLeave);
        int backArrive = Math.max(aliceArrive, bobArrive);
        return Math.max(firstLeave - backArrive + 1, 0);
    }

    private int getDayCounts(String date) {
        int month = Integer.parseInt(date.split("-")[0]);
        int day = Integer.parseInt(date.split("-")[1]);
        return daySums[month] + day;
    }
}
