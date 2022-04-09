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
 // 144 problems/binary-tree-preorder-traversal/
class BinaryTreePreorderTraversal {
    List<Integer> preOrderList = new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {  
        if (root == null) return preOrderList;
        else{
            preOrderList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return preOrderList;      
        
    }
}
