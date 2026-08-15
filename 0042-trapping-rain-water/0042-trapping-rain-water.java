class Solution {
    public int trap(int[] height)
    {
        // int n = height.length;
        // int lmax =0; int rmax =0; int total = 0;
        // int l = 0 ; int r = n-1;
        // while(l<r)
        // {
        //     if(height[l]<=height[r])
        //     {
        //         if(lmax>height[l]) total += lmax- height[l];
        //         else lmax = height[l];
        //         l++;
        //     } 
        //     else
        //     {
        //         if(rmax>height[r]) total += rmax - height[r];
        //         else rmax = height[r];
        //         r--;
        //     }
        // }
        // return total;
        int n  = height.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = height[0];
        rmax[n-1]= height[n-1];
        int res = 0;
        for(int i = 1 ; i < n-1; i++) lmax[i] = Math.max(height[i],lmax[i-1]);
        for(int i = n-2; i >= 0 ; i--) rmax[i] = Math.max(height[i],rmax[i+1]);
        for(int i = 1 ; i < n-1 ; i++) res += Math.min(rmax[i],lmax[i]) - height[i];
        return res;
    }
}