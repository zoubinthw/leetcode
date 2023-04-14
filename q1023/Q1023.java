package q1023;

import java.util.ArrayList;
import java.util.List;

public class Q1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        final var answers = new ArrayList<Boolean>();
        int len = queries.length;
        for (int i = 0; i < len; ++i) {
//            answers.add(isMatchByRegx(queries[i], pattern));
            answers.add(isMatchByDoublePoint(queries[i], pattern));
        }

        return answers;
    }

    private Boolean isMatchByRegx(String query, String pattern) {
        String basePattern = "([a-z]*)";
        final var builder = new StringBuilder();
        int len = pattern.length();
        for (int i = 0; i < len; ++i) {
            builder.append(basePattern).append(pattern.charAt(i));
        }
        builder.append(basePattern);
        final var regx = builder.toString();
        return query.matches(regx);
    }

    private Boolean isMatchByDoublePoint(String query, String pattern) {
        int pointP = 0;
        int patternLen = pattern.length();
        int queryStrLen = query.length();
        boolean result = true;
        for (int i = 0; i < queryStrLen; ++i) {
            final var ch = query.charAt(i);
            if (pointP < patternLen && pattern.charAt(pointP) == ch) {
                ++pointP;
            } else if (Character.isUpperCase(ch)) {
                result = false;
                break;
            }
        }

        if (pointP < patternLen) {
            result = false;
        }

        return result;
    }
}
