package org.example.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int min = 0;
        while(!queue.isEmpty()){
            min++;
            int size = queue.size();
            for(int i =0; i < size; i++){
                TreeNode temp = queue.poll();
                if(temp.left == null && temp.right == null){
                    return min;
                }
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
        }
        return min;
    }
}
