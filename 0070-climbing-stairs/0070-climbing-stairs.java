class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n + 1] ;
        Arrays.fill(dp, -1);
        // for (var v : dp)
        //     System.out.println(v);
        return fnc(n, dp);
    }
    public int fnc(int n, int [] dp){
        
        if (n < 0) return 0;
        if (n == 0)return 1;
        if(dp[n] != -1)
            return dp[n];
        int var = fnc(n - 1, dp) + fnc(n - 2, dp);
        return dp[n] = var;
    }
}