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
 // 94 problems/binary-tree-inorder-traversal
class BinaryTreeInorderTraversal {
    List<Integer> inOrderList = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return inOrderList;
        else{
            inorderTraversal(root.left);
            inOrderList.add(root.val);
            inorderTraversal(root.right);
        }
        return inOrderList; 
    }
}
