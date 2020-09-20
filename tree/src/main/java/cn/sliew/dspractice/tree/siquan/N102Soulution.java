package cn.sliew.dspractice.tree.siquan;

import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * 二叉树层序遍历
 */
public class N102Soulution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> currentLevel = new ArrayList<>();
            int size = queue.size();
            for (int i=0; i < size; i++) {
                TreeNode current = queue.poll();
                if (current == null) {
                    break;
                }
                currentLevel.add(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            result.add(currentLevel);
        }
        return result;
    }

    // TODO M2

}
