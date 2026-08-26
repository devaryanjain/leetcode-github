/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root)
    {
        maxDown(root);
        return res;
    }
    public int maxDown(TreeNode node)
    {
        if(node == null) return 0;
        int lsum = Math.max(0,maxDown(node.left));
        int rsum = Math.max(0,maxDown(node.right));
        res = Math.max(res,node.val+lsum+rsum);
        int ans = node.val + Math.max(lsum,rsum);
        return ans;
    }
}