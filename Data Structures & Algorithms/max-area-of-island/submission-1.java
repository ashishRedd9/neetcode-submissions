class Solution {
    private static final int[][] direc = {{-1,0},{1,0},{0,-1},{0,1}};
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }

        int area = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area = Math.max(area,dfs(grid,i,j));
                }
            }
        }

        return area;
    }

    private int dfs(int[][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }

        grid[i][j]=0;
        int res = 1;
        for(int[] dir : direc){
            int a = i+dir[0];
            int b = j+dir[1];
            res = res + dfs(grid,a,b);
        }

        return res;
    }
}
