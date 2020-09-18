package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 102. Binary Tree Level Order Traversal medium
 * tags: Tree, Breadth-first Search
 */
public class $102BinaryTreeLevelOrderTraversalExample {

    public List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $102BinaryTreeLevelOrderTraversalExample example = new $102BinaryTreeLevelOrderTraversalExample();
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.build(nums);
        List<List<Integer>> result = example.levelOrder(root);
        System.out.println(result);
    }
}
