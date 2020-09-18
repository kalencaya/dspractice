package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal medium
 * tags: Stack, Tree
 */
public class $144BinaryTreePreorderTraversalExample {

    public List<Integer> preorderTraversal(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $144BinaryTreePreorderTraversalExample example = new $144BinaryTreePreorderTraversalExample();
        Integer[] nums = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.preorderTraversal(root);
        System.out.println(result);
    }
}
