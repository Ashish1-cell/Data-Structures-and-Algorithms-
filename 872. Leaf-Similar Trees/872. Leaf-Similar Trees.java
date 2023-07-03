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
    public ArrayList<Integer> inOrder(TreeNode root,ArrayList<Integer> list){
        // ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        inOrder(root.left,list);
        inOrder(root.right,list);
        if(root.left==null && root.right == null){
            list.add(root.val);
        }
        return list;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        inOrder(root1,list1);
        inOrder(root2,list2);
        if(list1.size()!=list2.size())
        return false;
        for(int i =0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i))
            return false;
        }

    return true;
    }
}
