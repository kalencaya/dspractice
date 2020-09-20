package cn.sliew.dspractice.tree.siquan;

import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * 二叉树中序遍历
 */
public class N94Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveGet(root,result);
        return result;
    }

    public void recursiveGet(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        // left->root->right
        recursiveGet(root.left,result);
        result.add(root.val);
        recursiveGet(root.right,result);
    }

}
