/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 235.problems/lowest-common-ancestor-of-a-binary-search-tree/
class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pValue = p.val;
        int qValue = q.val;
        if(p.val > q.val){
            pValue = q.val;
            qValue = p.val;
        }
        return crawlBST(root, pValue, qValue);
    }
    
    private TreeNode crawlBST(TreeNode root, int pValue, int qValue){
        if(pValue<=root.val && root.val<=qValue){
            return root;
        }else if(qValue<root.val){
            return crawlBST(root.left, pValue, qValue);
        }else{
            return crawlBST(root.right, pValue, qValue);
        }
    }
}
