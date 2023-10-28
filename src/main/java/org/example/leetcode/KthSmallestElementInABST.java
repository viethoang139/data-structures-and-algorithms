package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInABST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = check(new ArrayList<>(), root);
        return list.get(k-1);
    }
    private List<Integer> check(List<Integer> l, TreeNode root){
        if(root == null) return null;
        check(l,root.left);
        l.add(root.val);
        check(l,root.right);
        return l;
    }
}
