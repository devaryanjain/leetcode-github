class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> ans =new ArrayList<>();
        Arrays.sort(candidates);
        combRec(0, candidates, target, ans, new ArrayList<>());    
        return ans;
    }
    public void combRec(int ind, int arr[], int target, List<List<Integer>> ans, List<Integer> ds)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(ind == arr.length || arr[ind] > target)return;
        ds.add(arr[ind]);
        combRec(ind,arr,target-arr[ind],ans,ds);
        ds.remove(ds.size()-1);
        combRec(ind+1,arr,target,ans,ds);
    }
}