package org.example.leetcode;


import java.util.LinkedList;
import java.util.Queue;

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

public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node pre = null;
            for(int i = 0; i < size; i++){
                Node curr = queue.poll();
                if(pre != null){
                    pre.next =curr;
                }
                pre = curr;
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
        }
        return root;
    }
}
