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
    public int maxLevelSum(TreeNode root) {
        int sum = 0 ;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return 0;
        }
        q.add(root);
       
        int max = Integer.MIN_VALUE;
        int height = 1;
        int x = 1;
        while(!q.isEmpty()){
            int level  = q.size();
            sum = 0;
            for(int i =0;i<level;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
            sum+=q.remove().val;
            }
            if(max<sum){
                max = sum;
                x = height;
            }
            height++;
        }
        return x ;
    }
}
