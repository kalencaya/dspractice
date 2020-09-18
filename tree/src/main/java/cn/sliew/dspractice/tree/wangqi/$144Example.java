package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$144BinaryTreePreorderTraversalExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 144. Binary Tree Preorder Traversal medium
 * tags: Stack, Tree
 */
public class $144Example extends $144BinaryTreePreorderTraversalExample {

    public List<Integer> preorderTraversal(TreeNode root) {
//        return recursiveTraversal(root);
        return nonRecursiveTraversal(root);
    }

    /**
     * 递归写法
     */
    private List<Integer> recursiveTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new LinkedList<>();
        recursive(root, result);
        return result;
    }

    private void recursive(TreeNode root, List<Integer> result) {
        result.add(root.val);
        if (root.left != null) {
            recursive(root.left, result);
        }

        if (root.right != null) {
            recursive(root.right, result);
        }
    }

    /**
     * 非递归写法
     */
    private List<Integer> nonRecursiveTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        $144BinaryTreePreorderTraversalExample example = new $144Example();
        Integer[] nums = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.preorderTraversal(root);
        System.out.println(result);
    }
}