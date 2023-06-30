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
    public int max=0;
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = dfs(root.left);
        int rh = dfs(root.right);
        int sum = lh+rh;
        if(max<sum){
            max = sum;
        }
        return 1+Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        
        dfs(root);
        return max;
    }
}
