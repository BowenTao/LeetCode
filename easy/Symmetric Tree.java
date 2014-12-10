/**Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return is_symmetric(root.left, root.right);
    }
        
        public boolean is_symmetric(TreeNode left, TreeNode right){
            if (left==null && right==null){
                return true;
            }
            if (left==null || right==null){
                return false;
            }
            if (left.val!=right.val){
                return false;
            }
            return is_symmetric(left.left,right.right) && is_symmetric(left.right,right.left);
        }
}
