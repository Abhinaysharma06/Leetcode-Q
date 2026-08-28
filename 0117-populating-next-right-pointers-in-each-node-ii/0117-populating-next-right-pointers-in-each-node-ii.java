/*
// Definition for a Node.
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

class Solution {
     public Node connect(Node root) {
    if (root == null) return null;

    Node left = root;

    while (left != null) {

        Node curr = left;
        Node nextLevelStart = null;
        Node prev = null;

        while (curr != null) {

            if (curr.left != null) {
                if (nextLevelStart == null) {
                    nextLevelStart = curr.left;
                }

                if (prev != null) {
                    prev.next = curr.left;
                }

                prev = curr.left;
            }

            if (curr.right != null) {
                if (nextLevelStart == null) {
                    nextLevelStart = curr.right;
                }

                if (prev != null) {
                    prev.next = curr.right;
                }

                prev = curr.right;
            }

            curr = curr.next;
        }

        left = nextLevelStart;
    }

    return root;
}
}