class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        List<Integer> ds = new ArrayList<>();
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] <= nums2[j])
            {
                ds.add(nums1[i]);
                i++;
            }
            else
            {
                ds.add(nums2[j]);
                j++;
            }
        }

        while(i < nums1.length)
        {
            ds.add(nums1[i]);
            i++;
        }

        while(j < nums2.length)
        {
            ds.add(nums2[j]);
            j++;
        }

        int n = ds.size();

        if(n%2 == 0 ) return (ds.get(n/2 - 1) + ds.get(n/2))/2.0;
        else return (ds.get(n/2));
        
    }
}