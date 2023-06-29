package q1253;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q1253 {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        int[][] res = new int[2][n];

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            if (colsum[i] == 2) {
                res[0][i] = 1;
                res[1][i] = 1;
                if(upper > 0 && lower > 0) {
                    upper--;
                    lower--;
                } else {
                    return result;
                }
            }
        }

        for (int i = 0; i < n; ++i) {
            if (colsum[i] == 1) {
                if (upper > 0) {
                    res[0][i] = 1;
                    --upper;
                } else if (lower > 0) {
                    res[1][i] = 1;
                    --lower;
                } else {
                    return result;
                }
            }
        }

        if (lower > 0 || upper > 0) return result;

        result.add(Arrays.stream(res[0]).boxed().collect(Collectors.toList()));
        result.add(Arrays.stream(res[1]).boxed().collect(Collectors.toList()));

        return result;
    }
}
