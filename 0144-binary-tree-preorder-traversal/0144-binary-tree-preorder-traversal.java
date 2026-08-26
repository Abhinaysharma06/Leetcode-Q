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
    public List<Integer> preorderTraversal(TreeNode root) { 
      List<Integer>ans=new ArrayList<>();
        return preorder(root,ans);
    }
    public List<Integer> preorder(TreeNode node,List<Integer>ans){
        if(node==null) return ans;
        ans.add(node.val);
       preorder(node.left,ans);
       preorder(node.right,ans); 
    return ans;
    }
}