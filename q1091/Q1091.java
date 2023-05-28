package q1091;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Q1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        int n = grid.length;
        int[][] dist = new int[n][n];
        for (int[] ints : dist) {
            Arrays.fill(ints, Integer.MAX_VALUE);
        }
        Queue<int[]> queue = new ArrayDeque<>();
        dist[0][0] = 1;
        queue.add(new int[]{0, 0}); // 队列里边存放点的(x, y)坐标
        while (!queue.isEmpty()) {
            int[] site = queue.poll();
            int x = site[0];
            int y = site[1];
            if ( x == n-1 && y == n-1) return dist[x][y];
            for (int dx = -1; dx <= 1; ++dx) {
                for (int dy = -1; dy <= 1; ++dy) {
                    int newX = site[0] + dx;
                    int newY = site[1] + dy;
                    if (newX < 0 || newX > n-1 || newY < 0 || newY > n-1) {
                        continue;
                    }
                    if (grid[newX][newY] == 1 || dist[newX][newY] <= dist[x][y] + 1 ) {
                        continue;
                    }
                    dist[newX][newY] = dist[x][y] + 1;
                    queue.add(new int[]{newX, newY});
                }
            }
        }

        return -1;
    }
}
