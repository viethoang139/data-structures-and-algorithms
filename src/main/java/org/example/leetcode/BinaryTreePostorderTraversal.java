package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getPostorderTraversal(root, list);
        return list;
    }
    public List<Integer> getPostorderTraversal(TreeNode root , List<Integer> list){
        if(root == null){
            return null;
        }
        getPostorderTraversal(root.left,list);
        getPostorderTraversal(root.right,list);
        list.add(root.val);
        return list;
    }
}
