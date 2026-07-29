class Solution {
    public int majorityElement(int[] nums)
    {
        int n = nums.length;
        int count = 0 ; 
        int res = 0 ; 
        for(int i = 0 ; i < n ; i ++)
        {
            if(count==0)
            {
                res = nums[i];
                count++;
            }
            else if(res == nums[i]) count++;
            else count--;
        }
        int count1 = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(res == nums[i]) count1++;
        }
        if(count1 > (n/2))return res;
        else return -1;
    }
}