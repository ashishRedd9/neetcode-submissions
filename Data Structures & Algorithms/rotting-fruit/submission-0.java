class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> queue = new ArrayDeque<>();
        int fresh = 0;
        int time=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    fresh++;
                }

                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }

        int[][] direc = {{-1,0},{1,0},{0,-1},{0,1}};

        while(fresh>0 && !queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];

                for(int[] dir : direc){
                    int row = r+dir[0];
                    int col = c+dir[1];
                    if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]==1){
                        grid[row][col] = 2;
                        queue.offer(new int[]{row,col});
                        fresh--;
                    }
                }
            }
            time++;
        }

        return fresh==0 ? time : -1;
    }
}
