package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;




class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getInorderTraversal(root, list);
        return list;
    }
    public List<Integer> getInorderTraversal(TreeNode root , List<Integer> list){
        if(root == null){
            return null;
        }
        getInorderTraversal(root.left,list);
        list.add(root.val);
        getInorderTraversal(root.right,list);
        return list;
    }
}
