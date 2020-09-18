package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$94BinaryTreeInorderTraversalExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class $94Example extends $94BinaryTreeInorderTraversalExample {

    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
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
        if (root.left != null) {
            recursive(root.left, result);
        }
        result.add(root.val);
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
            while (node != null) {
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
                node = node.left;
            }
            result.add(node.val);
            node = node.right;
        }
        return result;
    }

    public static void main(String[] args) {
        $94BinaryTreeInorderTraversalExample example = new $94Example();
        Integer[] nums = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.inorderTraversal(root);
        System.out.println(result);
    }
}
