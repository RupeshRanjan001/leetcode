class Solution {
    public int fn (int n , Integer[] dp){
       if (n <= 3){
        return n;
       }
       if (dp[n] != null){
        return dp[n];
       }
       return dp[n] = fn(n-1,dp) + fn (n-2, dp);
    }
   public int climbStairs (int n){
    Integer dp[] = new Integer [n+1];
    return fn (n, dp); 
   }
}     