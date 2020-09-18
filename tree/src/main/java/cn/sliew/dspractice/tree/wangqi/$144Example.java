package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$144BinaryTreePreorderTraversalExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal medium
 * tags: Stack, Tree
 */
public class $144Example extends $144BinaryTreePreorderTraversalExample {

    public List<Integer> preorderTraversal(TreeNode root) {
//        return recursiveTraversalRecursive(root);
        return nonRecursiveTraversalRecursive(root);
    }

    /**
     * 递归写法
     */
    private List<Integer> recursiveTraversalRecursive(TreeNode root) {
        return null;
    }

    /**
     * 非递归写法
     */
    private List<Integer> nonRecursiveTraversalRecursive(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $144BinaryTreePreorderTraversalExample example = new $144Example();
        Integer[] nums = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.preorderTraversal(root);
        System.out.println(result);
    }
}