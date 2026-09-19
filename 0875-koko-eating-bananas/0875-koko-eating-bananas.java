class Solution {
    public int minEatingSpeed(int[] piles, int h)
    {
        int n = piles.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i <  n; i++)
        {
            maxi = Math.max(maxi, piles[i]);
        }
        int low = 1; int high = maxi;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int totalH = findHours(piles,mid);
            if(totalH <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public int findHours(int [] piles, int mid)
    {
        int totalH = 0;
        for(int i = 0 ; i < piles.length; i++)
        {
            totalH += Math.ceil((double)piles[i]/mid);
        }
        return totalH;
    }
}
