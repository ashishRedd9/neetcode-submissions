class Solution {
    private static int direc[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public void islandsAndTreasure(int[][] grid) {

        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    queue.add(new int[]{i,j});
                }
            }
        }

        if(queue.size()==0) return;

        while(!queue.isEmpty()){
            int[] curr= queue.poll();
            int row = curr[0];
            int col = curr[1];
            for(int[] dir : direc){
                int r = row + dir[0];
                int c = col + dir[1];
                if(r>=grid.length||c>=grid[0].length||r<0||c<0||grid[r][c]!=Integer.MAX_VALUE){
                    continue;
                }

                queue.add(new int[]{r,c});

                grid[r][c] = grid[row][col] + 1;
            }
        }

    }
}
