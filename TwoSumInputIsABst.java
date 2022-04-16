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
 // 653.problems/two-sum-iv-input-is-a-bst/
class TwoSumInputIsABst {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> numberSet = new HashSet<>();
        if (root == null || (root.right == null && root.left == null)){
            return false;
        }
        return crawlBinaryTree(root, k, numberSet);
    }
    
    private boolean crawlBinaryTree(TreeNode root, int k, Set numberSet){
        if(root != null){
            if(numberSet.contains(k-root.val)){
                return true;
            }else{
               numberSet.add(root.val); 
            }
            if(crawlBinaryTree(root.left,k,numberSet) || crawlBinaryTree(root.right,k,numberSet)){
                 return true;
            }
        }
        return false;
    }
}
