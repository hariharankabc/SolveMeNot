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
 // 98.problems/validate-binary-search-tree/
class ValidateBinarySearchTree {
    TreeNode previousNode;
    public boolean isValidBST(TreeNode root) {
        return validateBST(root);
    }
    
    private boolean validateBST(TreeNode root){
        if(root != null){
            if(!validateBST(root.left)){
               return false; 
            }
            if(previousNode != null){
                if(previousNode.val >= root.val){
                    return false;
                }
            }
            previousNode = root;
            return validateBST(root.right);
        }else{
            return true;
        }
    }
}
