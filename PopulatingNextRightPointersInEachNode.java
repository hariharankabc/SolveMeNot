/*
// 116.problems/populating-next-right-pointers-in-each-node/
Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
    if(root == null)
        return root;
    nodeNextBuild(root);
    return root;
    }

    public void nodeNextBuild(Node node) {
        if(node.left == null)
            return;
        node.left.next = node.right;
        if(node.next != null)
            node.right.next = node.next.left;
        else
            node.right.next = null;
        nodeNextBuild(node.left);
        nodeNextBuild(node.right);
    }
}
