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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        int count = 0;
        if(root ==null){
            return result;
        }
        q.add(root);
        count++;
        while(!q.isEmpty()){
            int level = q.size();
            LinkedList<Integer> list = new LinkedList<>();
            for(int i =0;i<level;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                if(count%2==0)
                    list.addFirst(q.remove().val);
                else{
                    list.addLast(q.remove().val);
                    }

            }
             count++;
            result.add(list); 
        }
           
              
        
        return result;
    }
}
