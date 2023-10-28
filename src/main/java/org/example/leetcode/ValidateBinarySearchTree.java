package org.example.leetcode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return check(root, null,null);
    }

    private boolean check(TreeNode root, Integer min, Integer max){
        if(root == null) return true;

        if((min != null && root.val <= min) || (max != null && root.val >= max)){
            return false;
        }
        return (check(root.left,min,root.val) && check(root.right,root.val,max));
    }
}
