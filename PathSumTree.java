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
// 112 problems/path-sum/
class PathSumTree {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        int currentTotal = root.val;
        if(root.left == null && root.right == null){
            return root.val == targetSum ? true : false;
        }
        return crawlTree(root.left, targetSum, currentTotal) || crawlTree(root.right, targetSum, currentTotal); 
    }
    
    private boolean crawlTree(TreeNode root, int targetSum, int currentTotal){
        if(root == null) return false;
        currentTotal += root.val;
        if(root.left == null && root.right ==null){
            return targetSum == currentTotal;
        }
        return crawlTree(root.left, targetSum, currentTotal) || crawlTree(root.right, targetSum, currentTotal);
    }
}
