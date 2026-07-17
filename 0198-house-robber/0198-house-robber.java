class Solution {
    // public int rob(int[] nums)
    // {
    //     int n = nums.length;
    //     int[] dp = new int[n];
    //     Arrays.fill(dp, -1);
    //     return f(n-1, nums, dp);
    // }
    // public int f(int  ind, int[] nums, int[] dp)
    // {
    //     if(ind == 0) return nums[ind];
    //     if(ind < 0) return 0;
    //     if( dp[ind] != -1) return dp[ind];
    //     int pick = nums[ind] + f(ind-2, nums, dp);
    //     int notpick = 0 + f(ind-1, nums, dp);

    //     return dp[ind] = Math.max(pick,notpick);
    // }

    public int rob(int[] nums)
    {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        return f(nums, dp);
    }
    public int f(int[] nums, int[] dp)
    {
        int n = nums.length;  
        for(int i = 1 ; i < n ; i++)
        {           
            int pick = nums[i];
            if(i>1) pick += dp[i-2];
            int notpick = 0 + dp[i-1];
            dp[i] = Math.max(pick,notpick);
        }
        return dp[n-1];
    }
}