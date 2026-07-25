class Solution {

    public int[][] merge(int[][] intervals) {

        
    Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
    List<List<Integer>> ans = new ArrayList<>();
    int start = intervals[0][0];
    int end = intervals[0][1];

    for(int i = 1 ; i<intervals.length; i++)
    {
        if(intervals[i][0]<=end) end = Math.max(end,intervals[i][1]);
        else
        {
            List<Integer>temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);
            start = intervals[i][0];
            end = intervals[i][1];
        }
    }
    ArrayList<Integer> temp = new ArrayList<>();
    temp.add(start);
    temp.add(end);
    ans.add(temp);
    int [][]res = new int[ans.size()][2];

    for(int i = 0 ; i < ans.size(); i++)
    {
        res[i][0] = ans.get(i).get(0);
        res[i][1] = ans.get(i).get(1);
    }
    return res;
}
}