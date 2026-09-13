class Solution {
    private static final int[][] direc = {{-1,0},{1,0},{0,-1},{0,1}};
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }

        int area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    area = Math.max(area,bfs(grid,i,j));
                }
            }
        }

        return area;
    }

    private int bfs(int[][] grid,int i,int j){
        Queue<int[]> q = new LinkedList<>();
        grid[i][j] = 0;
        q.add(new int[]{i,j});
        int res=1;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            for(int[] dir : direc){
                int a=row+dir[0];
                int b = col+dir[1];
                if(a>=0 && b>=0 && a<grid.length && b<grid[0].length && grid[a][b]==1){
                    q.add(new int[]{a,b});
                    grid[a][b] = 0;
                    res++;
                }
            }
        }

        return res;
    }
}
