package com.ai;
//一道非常经典的深度优先搜索（DFS）题目，计算二维网格中岛屿的数量。
//题目描述：给定一个由 '1'（陆地）和 '0'（水）组成的二维网格，计算岛屿的数量。岛屿
//由水平或垂直方向相邻的陆地连接而成，并且你可以假设网格的四个边缘都被水包围。
class Solution8 {

    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        // 边界条件
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        // 将访问过的陆地标记为水，避免重复访问
        grid[r][c] = '0';

        // 递归访问上下左右
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }
}
