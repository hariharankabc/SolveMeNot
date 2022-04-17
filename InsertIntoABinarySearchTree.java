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
 // 701 problems/insert-into-a-binary-search-tree/
class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }
        crawlBinarySearchTree(root, val);
        return root;
    }
    
    private void crawlBinarySearchTree(TreeNode root, int val){
        if(root.val > val){
            if(root.left == null){
                TreeNode newNode = new TreeNode(val);
                root.left = newNode;
            }else{
                crawlBinarySearchTree(root.left, val);
            }
        }else{
            if(root.right == null){
                TreeNode newNode = new TreeNode(val);
                root.right = newNode;
            }else{
                crawlBinarySearchTree(root.right, val);
            }
        }
    }
}
