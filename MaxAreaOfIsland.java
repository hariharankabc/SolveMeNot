class MaxAreaOfIsland {
// 695. problems/max-area-of-island [NB]
    public int maxAreaOfIsland(int[][] grid) {
        int columnLength = grid[0].length;
        int rowLength = grid.length;
        int size = 0;
        int tempSize = 0;
        for(int i=0; i< rowLength; i++){
            for(int j=0; j<columnLength;j++){
                if(grid[i][j]==1){
                    tempSize = crawlIsland(grid, i, j, rowLength, columnLength, 0);
                    if(tempSize>size){
                        size = tempSize;
                    }
                }
            }
        }
        return size;
    }
    private int crawlIsland(int[][] grid, int i, int j, int rowLength, int columnLength, int size){
        if(grid[i][j]==1){
            size = size + 1;
            grid[i][j] = -1;
            if(i+1 < rowLength){
                size = crawlIsland(grid, i+1, j, rowLength, columnLength, size);
            }
            if(j+1 < columnLength){
                size = crawlIsland(grid, i, j+1, rowLength, columnLength, size);
            }
            if(i-1 > -1){
                size = crawlIsland(grid, i-1, j, rowLength, columnLength, size);
            }
            if(j-1 > -1){
                size = crawlIsland(grid, i, j-1, rowLength, columnLength, size);
            }
        }
        return size;
    }
}
