package q1637;

import java.util.Arrays;
import java.util.Comparator;

public class Q1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        int result = 0;
        for (int i = 1; i < points.length; ++i) {
            result = Math.max(points[i][0] - points[i - 1][0], result);
        }

        return result;
    }
}
