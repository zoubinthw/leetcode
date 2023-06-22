package qview16_19;

import java.util.*;

public class QView16_19 {
    private static final int[][] direct = {
            {0, -1}, {1, -1}, {1, 0}, {1, 1},
            {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}
    };
    public int[] pondSizes(int[][] land) {
        int row = land.length, col = land[0].length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (land[i][j] == 0) {
                    result.add(bfs(land, i, j));
                }
            }
        }

        Collections.sort(result);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private Integer bfs(int[][] land, int px, int py) {
        int cnt = 1, row = land.length, col = land[0].length;
        land[px][py] = -1;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{px, py});

        while (!queue.isEmpty()) {
            int[] site = queue.poll();
            int ox = site[0], oy = site[1];
            for (int i = 0; i < 8; ++i) {
                int dx = direct[i][0], dy = direct[i][1];
                int x = ox + dx, y = oy + dy;
                while (x >= 0 && x < row && y >= 0 && y < col && land[x][y] == 0) {
                    land[x][y] = -1;
                    ++cnt;
                    queue.offer(new int[]{x, y});
                    x += dx;
                    y += dy;
                }
            }

        }

        return cnt;
    }
}
