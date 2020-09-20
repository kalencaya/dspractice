package cn.sliew.dspractice.tree.siquan;

import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * 二叉树后序遍历
 */
public class N145Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveGet(root,result);
        return result;
    }


    public void recursiveGet(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        // left->right->root
        recursiveGet(root.left,result);
        recursiveGet(root.right,result);
        result.add(root.val);
    }

}
