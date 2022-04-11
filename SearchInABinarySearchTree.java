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
 // 700 problems/search-in-a-binary-search-tree/
class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(root.right == null && root.left == null) return null;
        return crawlBinarySearchTree(root, val);
    }
    
    private TreeNode crawlBinarySearchTree(TreeNode root, int val){
        if(root.val == val){
            return root;
        }else if(root.val > val && root.left != null){
            return crawlBinarySearchTree(root.left, val); 
        }else if(root.val < val && root.right != null){
            return crawlBinarySearchTree(root.right, val);
        }else{
            return null;
        }
    }
}
