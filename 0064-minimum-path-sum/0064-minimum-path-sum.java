class Solution {
    public int minPathSum(int[][] grid) {
        int [][]dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }
      return path(grid,0,0,dp);    
    }
    public int path(int[][]ruby,int i,int j,int [][]dp){
        if(i==ruby.length-1 &&j==ruby[0].length-1){
        return ruby[i][j];
        }
        if(i>=ruby.length||j>=ruby[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int left=path(ruby,i,j+1,dp);
        int down=path(ruby,i+1,j,dp);
       int minimum=Math.min(left,down);
        return dp[i][j]=minimum+ruby[i][j];
    
    }
}