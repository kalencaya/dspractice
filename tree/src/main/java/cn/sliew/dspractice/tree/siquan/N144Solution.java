package cn.sliew.dspractice.tree.siquan;

import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *  https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 *  给定一个二叉树，返回它的 前序 遍历
 */
public class N144Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        //LinkedList pollLast 也可以实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) {
            return result;
        }
        stack.add(root);
        // 递归遍历处理
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val);
            if (current.right != null) {
                stack.push(current.right);
            }
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        return result;
    }

}
