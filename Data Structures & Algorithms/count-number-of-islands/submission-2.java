class Solution {
    private static final int[][] direc = {{-1,0},{1,0},{0,-1},{0,1}};
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0||grid[0].length==0){
            return 0;
        }

        int islands=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    bfs(grid,i,j);
                    islands++;
                }
            }
        }

        return islands;
    }

    private void bfs(char[][] grid,int i,int j){
        Queue<int[]> q = new LinkedList<>();
        grid[i][j] = '0';
        q.add(new int[]{i,j});

        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0];
            int col = node[1];

            for(int[] dir : direc){
                int a = row+dir[0];
                int b = col+dir[1];
                if(a>=0 && b>=0 && a<grid.length && b<grid[0].length && grid[a][b]=='1'){
                    q.add(new int[]{a,b});
                    grid[a][b] = '0';   
                }
            }
        }
    }
}
