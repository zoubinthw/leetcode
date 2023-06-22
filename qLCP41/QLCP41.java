package qLCP41;

import java.util.ArrayDeque;
import java.util.Queue;

public class QLCP41 {
    private static final int[][] direct = {
            {0, -1}, {1, -1}, {1, 0}, {1, 1},
            {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}
    };
    public int flipChess(String[] chessboard) {
        int row = chessboard.length, col = chessboard[0].length();
        int res = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (chessboard[i].charAt(j) == '.') {
                    res = Math.max(res, bfs(i, j, chessboard));
                }
            }
        }

        return res;
    }

    private int bfs(int px, int py, String[] chessboard) {
        int row = chessboard.length, col = chessboard[0].length();
        char[][] board = new char[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                board[i][j] = chessboard[i].charAt(j);
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{px, py});
        board[px][py] = 'X';
        int cnt = 0;
        while (!queue.isEmpty()) {
            int[] site = queue.poll();
            int ox = site[0], oy = site[1];
            for (int i = 0; i < 8; ++i) {
                int dx = direct[i][0], dy = direct[i][1];
                if (check(ox, oy, dx, dy, board)) {
//                    ox += dx;
//                    oy += dy;
//                    while (board[ox][oy] != 'X') {
//                        board[ox][oy] = 'X';
//                        queue.add(new int[]{ox, oy});
//                        ++cnt;
//                        ox += dx;
//                        oy += dy;
//                    }
                    int x = ox + dx, y = oy + dy;
                    while (board[x][y] != 'X') {
                        queue.add(new int[]{x, y});
                        board[x][y] = 'X';
                        x += dx;
                        y += dy;
                        ++cnt;
                    }
                }
            }
        }

        return cnt;
    }

    private boolean check(int px, int py, int dx, int dy, char[][] board) {
        int row = board.length, col = board[0].length;
        while (px + dx >= 0 && px + dx < row && py + dy >= 0 && py + dy < col) {
            px += dx;
            py += dy;
            if (board[px][py] == 'X') return true;
            if (board[px][py] == '.') return false;
        }
        return false;
    }
}
