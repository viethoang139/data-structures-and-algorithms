package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getPreorderTraversal(root, list);
        return list;
    }
    public List<Integer> getPreorderTraversal(TreeNode root , List<Integer> list){
        if(root == null){
            return null;
        }
        list.add(root.val);
        getPreorderTraversal(root.left,list);
        getPreorderTraversal(root.right,list);
        return list;
    }
}
