public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    count += search(grid, i, j);
                }
            }
        }

        return count;
    }

    public int search(char[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[row].length || grid[row][column] == '0') {
            return 0;
        }

        grid[row][column] = '0';
        search(grid, row, column + 1);
        search(grid, row, column - 1);
        search(grid, row + 1, column);
        search(grid, row - 1, column);
        return 1;
    }
}
