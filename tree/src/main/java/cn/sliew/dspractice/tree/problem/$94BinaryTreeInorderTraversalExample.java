package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal medium
 * tags: Hash Table, Stack, Tree
 */
public class $94BinaryTreeInorderTraversalExample {

    public List<Integer> inorderTraversal(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $94BinaryTreeInorderTraversalExample example = new $94BinaryTreeInorderTraversalExample();
        Integer[] nums = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.inorderTraversal(root);
        System.out.println(result);
    }
}
