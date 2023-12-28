package org.example.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeII {
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
