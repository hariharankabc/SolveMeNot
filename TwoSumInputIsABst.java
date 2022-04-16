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
        Map<Integer,Integer> numberMap = new HashMap<Integer,Integer>();
        if (root == null || (root.right == null && root.left == null)){
            return false;
        }
        return crawlBinaryTree(root, k, numberMap);
    }
    
    private boolean crawlBinaryTree(TreeNode root, int k, Map numberMap){
        if(root != null){
            int requiredNumber = 0;
            requiredNumber = k-root.val;
            if(numberMap.containsKey(requiredNumber)){
                return true;
            }else{
               numberMap.put(root.val,0); 
            }
            if(crawlBinaryTree(root.left,k,numberMap) || crawlBinaryTree(root.right,k,numberMap)){
                 return true;
            }
        }
        return false;
    }
}
