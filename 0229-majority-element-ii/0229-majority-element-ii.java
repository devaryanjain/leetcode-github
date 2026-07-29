class Solution {
    public List<Integer> majorityElement(int[] nums)
    {
        int n = nums.length;
        int c1 = 0; int c2 = 0 ;
        int e1 = 0 ; int e2 =0 ;
        for(int num: nums)
        {
            if(e1 == num) c1++;
            else if(e2 == num)c2++;
            else if(c1 == 0)
            {
                e1 = num; c1++;
            }
            else if(c2 == 0)
            {
                e2 = num ; c2++;
            }
            else
            {
                c1--;c2--;
            }
        }
        ArrayList<Integer>res = new ArrayList<>();
        c1 = 0 ; c2 = 0;
        for(int num : nums)
        {
            if(e1 == num) c1++;
            else if(e2 == num)c2++;
        }
        int m = n/3;
        if(c1 > m)res.add(e1);
        if(c2 > m)res.add(e2);
        Collections.sort(res);
        return res;
    }
}