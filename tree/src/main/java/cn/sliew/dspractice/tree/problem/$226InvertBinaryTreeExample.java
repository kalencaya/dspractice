package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 226. Invert Binary Tree easy
 * tags: Tree
 */
public class $226InvertBinaryTreeExample {

    public TreeNode invertTree(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $226InvertBinaryTreeExample example = new $226InvertBinaryTreeExample();
        Integer[] nums = new Integer[]{4, 2, 7, 1, 3, 6, 9};
        TreeNode root = TreeNode.build(nums);
        TreeNode result = example.invertTree(root);
        $102BinaryTreeLevelOrderTraversalExample levelTraversal =
                new $102BinaryTreeLevelOrderTraversalExample();
        List<List<Integer>> list = levelTraversal.levelOrder(result);
        System.out.println(list);
    }
}
