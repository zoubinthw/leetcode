package q0874;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q0874 {
    private static int[][] dist = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<Integer> set = new HashSet<>();
        for (int[] ele : obstacles) {
            set.add(ele[0] * 60001 + ele[1]);
        }
        // -1: 右转,-2:左转
        // 0: 北, 1: 东, 2: 南, 3: 西
        int dir = 0, res = 0;
        int rx = 0, ry = 0;
        for (int command : commands) {
            if (command > 0) {
                for (int j = 0; j < command; ++j) {
                    int next = (rx + dist[dir][0]) * 60001 + ry + dist[dir][1];
                    if (set.contains(next)) {
                        break;
                    }
                    rx += dist[dir][0];
                    ry += dist[dir][1];
                    res = Math.max(res, rx * rx + ry * ry);
                }
            } else {
                if (command == -2) {
                    dir = (dir + 3) % 4;
                }
                if (command == -1) {
                    dir = (dir + 1) % 4;
                }
            }
        }

        return res;
    }
}
