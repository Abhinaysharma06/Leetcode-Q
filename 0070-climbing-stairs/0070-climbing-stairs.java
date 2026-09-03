class Solution {
//     public int climbStairs(int n) {
//       return climb(n);  
//     }
//     static int climb(int n){
//         if(n==0||n==1){
//             return 1;
//         }
//         return climb(n-1)+climb(n-2);
//     }
// }
int[] dp;

public int climbStairs(int n) {
    dp = new int[n + 1];
    Arrays.fill(dp, -1);
    return climb(n);
}

public int climb(int n) {
    if(n == 0 || n == 1) {
        return 1;
    }

    if(dp[n] != -1) {
        return dp[n];
    }

    return dp[n] = climb(n-1) + climb(n-2);
}
}