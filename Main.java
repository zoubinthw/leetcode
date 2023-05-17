import q2446.Q2446;

public class Main {
    public static void main(String[] args) {
        Q2446 q2446 = new Q2446();
        String[] event1 = {"01:15","02:00"};
        String[] event2 = {"03:00","03:20"};
        System.out.println(q2446.haveConflict(event1, event2));

    }
}
