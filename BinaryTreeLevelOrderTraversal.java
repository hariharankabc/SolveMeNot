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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int nodeLevel = 1;
        List<List<Integer>> levelOrderList = new ArrayList();
        if(root == null){
            return levelOrderList;
        }
        List<Integer> currentLevelList = new ArrayList();
        currentLevelList.add(root.val);
        levelOrderList.add(currentLevelList);
        crawlTree(root.left, root.right, nodeLevel, levelOrderList);
        return levelOrderList;
    }
    // 102. problems/binary-tree-level-order-traversal/
    private void crawlTree(TreeNode leftNode, TreeNode rightNode, int nodeLevel, List<List<Integer>> levelOrderList){
        if(leftNode!=null || rightNode!=null){
            List<Integer> currnetLevelList = null;
            if(levelOrderList.size()<=nodeLevel){
                currnetLevelList = new ArrayList(); 
                levelOrderList.add(currnetLevelList);
            }else{
                currnetLevelList = levelOrderList.get(nodeLevel);                
            }
            if(leftNode!=null){
                currnetLevelList.add(leftNode.val);  
            }
            if(rightNode!=null){
                currnetLevelList.add(rightNode.val);
            }
            nodeLevel += 1;
            if(leftNode!=null){
                crawlTree(leftNode.left, leftNode.right, nodeLevel, levelOrderList);
            }
            if(rightNode!=null){
                crawlTree(rightNode.left, rightNode.right, nodeLevel, levelOrderList);
            }
        }
    }
}
