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
    public List<String> binaryTreePaths(TreeNode root) {
      List<String>ans=new ArrayList<>();
      helper(root,"",ans);
      return ans;
    }
    public void helper(TreeNode root, String s,List<String>list){
        if(root==null)return;
        if(s.equals("")){
            s=s+root.val;
        }
        else{
            s=s+"->"+root.val;
        } 
        if(root.left==null&&root.right==null){
            list.add(s);
            return ;
        }
          helper(root.left,s,list);
          helper(root.right,s,list);
    }
}