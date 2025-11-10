package com.ai;

public class L2023113041_8_Test {

    public static void main(String[] args) {
        Solution8 sol = new Solution8();

        // 测试用例 1：多岛屿情况
        char[][] grid1 = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        runTest(sol, grid1, 3, "测试用例 1：多岛屿");

        // 测试用例 2：单个岛屿
        char[][] grid2 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        runTest(sol, grid2, 1, "测试用例 2：单个岛屿");

        // 测试用例 3：全是水
        char[][] grid3 = {
                {'0','0'},
                {'0','0'}
        };
        runTest(sol, grid3, 0, "测试用例 3：全是水");

        // 测试用例 4：1x1 网格
        char[][] grid4 = {{'1'}};
        runTest(sol, grid4, 1, "测试用例 4：1x1 网格");
    }

    //辅助方法：执行测试并打印结果
    private static void runTest(Solution8 sol, char[][] grid, int expected, String testName) {
        // dfs 会修改 grid，所以先复制或直接传入新数组
        int result = sol.numIslands(copyGrid(grid));
        if (result == expected) {
            System.out.println(testName + " 通过 ");
        } else {
            System.out.println(testName + " 失败，期望 " + expected + "，实际 " + result);
        }
    }

    //辅助方法：复制二维数组
    private static char[][] copyGrid(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        char[][] copy = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(grid[i], 0, copy[i], 0, cols);
        }
        return copy;
    }
}
//comment：代码批注清晰易懂，执行顺利流畅，完美完成任务 2025/11/10