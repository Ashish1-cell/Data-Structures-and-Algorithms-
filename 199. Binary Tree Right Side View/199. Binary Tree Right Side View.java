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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return list;
        }
        TreeNode node = null;
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            for(int i =0;i<level;i++){
                if(q.peek().left!= null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!= null){
                    q.add(q.peek().right);
                    
                }
              node = q.remove();
            }
            list.add(node.val);
        }
        return list;
    }
}
