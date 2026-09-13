class Solution {
    private static final int[][] direc = {{-1,0},{1,0},{0,-1},{0,1}};
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0|| grid[0].length==0){
            return 0;
        }

        int islands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void dfs(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0'){
            return;
        }

        grid[i][j] = '0';
        for(int[] dir : direc){
            int a = i+dir[0];
            int b = j+dir[1];
            dfs(grid,a,b);
        }
    }
}
