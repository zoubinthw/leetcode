package q1003;

public class Q1003 {
    public boolean isValid(String s) {
        if (s.length() < 3 || s.length() % 3 != 0) return false;
        if (s.length() == 3) return "abc".equals(s);
        boolean result = false;
        for (int start = 0, end = 3; end < s.length();) {
            if ("abc".equals(s.substring(start, end))) {
                result = isValid(s.substring(0, start) + s.substring(end));
                break;
            }
            start++;
            end = start + 3;
        }

        return result;
    }
}
