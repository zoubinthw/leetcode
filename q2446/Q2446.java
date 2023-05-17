package q2446;

public class Q2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        return compare(event1[0], event1[1], event2[0]) || compare(event2[0], event2[1], event1[0]);
    }

    private boolean compare(String eventStart, String eventEnd, String eventLine) {
        int start = toMinute(eventStart);
        int end = toMinute(eventEnd);
        int line = toMinute(eventLine);
        return start <= line && end >= line;
    }

    private int toMinute(String eventTime) {
        String[] hourMinute = eventTime.split(":");
        return Integer.parseInt(hourMinute[0]) * 60 + Integer.parseInt(hourMinute[1]);
    }
}
