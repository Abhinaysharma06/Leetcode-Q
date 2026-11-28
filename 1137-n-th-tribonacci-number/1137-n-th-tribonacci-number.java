class Solution {
    public int tribonacci(int n) {
        int []dp=new int [n+1];
        Arrays.fill(dp,-1);
        return number(n,dp);
       }
       public int number(int i,int []dp){
        if(i==0)return 0;
        if(i==1||i==2)return 1;
        
        if(dp[i]!=-1){
            return dp[i];
        }

        return dp[i]=number(i-1,dp)+ number(i-2,dp)+number(i-3,dp);
       } 
    }
