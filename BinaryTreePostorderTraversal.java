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
 // 145 problems/binary-tree-postorder-traversal
class BinaryTreePostorderTraversal {
    List<Integer> postOrderList = new ArrayList();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return postOrderList;
        else{
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            postOrderList.add(root.val);
        }
        return postOrderList;  
    }
}
