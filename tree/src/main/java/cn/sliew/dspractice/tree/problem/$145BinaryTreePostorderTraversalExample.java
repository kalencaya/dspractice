package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 145. Binary Tree Postorder Traversal medium
 * tags: Stack, Tree
 */
public class $145BinaryTreePostorderTraversalExample {

    public List<Integer> postorderTraversal(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $145BinaryTreePostorderTraversalExample example = new $145BinaryTreePostorderTraversalExample();
        Integer[] nums = new Integer[]{1, null, 2, 3};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.postorderTraversal(root);
        System.out.println(result);
    }
}
