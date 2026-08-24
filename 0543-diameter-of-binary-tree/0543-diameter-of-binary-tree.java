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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
     depth(root);
     return diameter-1;   
        
    }
   public  int depth (TreeNode root){
    if(root==null){
        return 0;
    }
    int leftNode=depth(root.left);
    int rightNode=depth(root.right);

    int dia=(leftNode+rightNode)+1;
    diameter=Math.max(dia,diameter);

   return Math.max(leftNode,rightNode)+1;
   }
}