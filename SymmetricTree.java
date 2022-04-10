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
// 101 problems/symmetric-tree/ 
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {     
        return root == null || equals(root.left, root.right);
    }
    
    private boolean equals(TreeNode root, TreeNode leaf2){
        if(root == null && leaf2 == null){
            return true;
        }
        if(root == null || leaf2 == null){
            return false;
        }
        if(root.val != leaf2.val) return false;
        return equals(root.left, leaf2.right) && equals(root.right, leaf2.left);        
    }
}
