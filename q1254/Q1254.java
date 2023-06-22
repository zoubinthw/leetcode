package q1254;

public class Q1254 {
    public int closedIsland(int[][] grid) {
        int ans = 0, row = grid.length, col = grid[0].length;
        if (row < 3 || col < 3) return 0;
        for (int i = 0; i < row; ++i) {
            int step = i == 0 || i == row-1 ? 1 : col-1;
            for (int j = 0; j < col; j += step) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j);
                }
            }
        }

        for (int i = 1; i < row; ++i) {
            for (int j = 1; j < col; ++j) {
                if (grid[i][j] == 0) {
                    ++ans;
                    dfs(grid, i, j);
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] grid, int x, int y) {
        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 0) {
            grid[x][y] = 1;
            dfs(grid, x-1, y);
            dfs(grid, x+1, y);
            dfs(grid, x, y-1);
            dfs(grid, x, y+1);
        }
    }
}
