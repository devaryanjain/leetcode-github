class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid =0 , high = n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                mid ++; low++;
            }
            else if(nums[mid] == 1)
            {
                mid ++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums,high,mid);
                high --;
            }            
        }

    }
    void swap(int arr[], int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}