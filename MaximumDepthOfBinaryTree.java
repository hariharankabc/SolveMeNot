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
 // 104 problems/maximum-depth-of-binary-tree/
class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftLength = crawlTree(root.left, 1);
        int rightLength =  crawlTree(root.right, 1);
        return leftLength > rightLength? leftLength: rightLength;
    }
        
    private int crawlTree(TreeNode root, int currentLength){
        if(root == null) return -1;
        currentLength += 1;
        if(root.left == null && root.right ==null){
            return currentLength;
        }
        int leftLength = crawlTree(root.left, currentLength);
        int rightLength = crawlTree(root.right, currentLength);
        return leftLength > rightLength? leftLength: rightLength;
    }
}
