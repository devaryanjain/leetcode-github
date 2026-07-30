class Solution {
    public int maxProduct(int[] nums)
    {
        int maxP = nums[0];
        int minP = nums[0];
        int res = nums[0];

        for(int i = 1 ; i < nums.length ;i++)
        {
            if(nums[i] < 0)
            {
                int temp = maxP;
                maxP = minP;
                minP = temp;
            }
            maxP = Math.max(nums[i], maxP*nums[i]);
            minP = Math.min(nums[i], minP*nums[i]);
            res = Math.max(maxP, res);
        }
        return res;
    }
}