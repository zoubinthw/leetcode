package q2437;

public class Q2437 {
    public int countTime(String time) {
        String[] hourMinute = time.split(":");
        String hour = hourMinute[0];
        String minute = hourMinute[1];

        return numOfHour(hour) * numOfMinute(minute);
    }

    private int numOfMinute(String minute) {
        int site = siteOfQuestionMark(minute);
        switch (site) {
            case 1:
                return 10;
            case 2:
                return 6;
            case 3:
                return 60;
            default:
                return 1;
        }
    }

    private int numOfHour(String hour) {
        int site = siteOfQuestionMark(hour);
        switch (site) {
            case 1:
                int ch = hour.charAt(0);
                switch (ch) {
                    case '0':
                    case '1':
                        return 10;
                    case '2':
                        return 4;
                }
            case 2:
                int k = Integer.parseInt(hour.substring(1));
                if (k < 4) return 3;
                return 2;
            case 3:
                return 24;
            default:
                return 1;
        }
    }

    private int siteOfQuestionMark(String time) {
        int result = 0;
        result += time.charAt(0) == '?' ? 2 : 0;
        result += time.charAt(1) == '?' ? 1 : 0;
        return result;
    }
}
