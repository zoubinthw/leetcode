package q1072;

import java.util.HashMap;
import java.util.Map;

public class Q1072 {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int result = 0, height = matrix.length;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < height; ++i) {
            StringBuilder builder = new StringBuilder();
            for (int num : matrix[i]) {
                builder.append(num ^ matrix[i][0]);
            }
            Integer count = map.merge(builder.toString(), 1, Integer::sum);
            result = Math.max(result, count);
        }

        return result;

        /**
         * 执行用时：
         * 24 ms
         * , 在所有 Java 提交中击败了
         * 49.07%
         * 的用户
         * 内存消耗：
         * 55.3 MB
         * , 在所有 Java 提交中击败了
         * 26.85%
         * 的用户
         * */
    }
}
