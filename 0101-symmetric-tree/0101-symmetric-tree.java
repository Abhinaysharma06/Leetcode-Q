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
    public boolean isSymmetric(TreeNode root) {
      Queue<TreeNode>queue=new LinkedList<>();
      queue.offer(root.left);
      queue.offer(root.right);
      while(!queue.isEmpty()){
        TreeNode leftmost=queue.poll();
        TreeNode rightmost=queue.poll();
        if(rightmost==null&&leftmost==null) continue;
         if(leftmost==null||rightmost==null){
            return false;
         }
        if(leftmost.val!=rightmost.val) return false;

         queue.add(leftmost.left);
         queue.add(rightmost.right);
         queue.add(leftmost.right);
         queue.add(rightmost.left);
      }
      return true;

    }
}