package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 199. Binary Tree Right Side View medium
 * tags: Tree, Depth-first Search, Breadth-first Search
 */
public class $199BinaryTreeRightSideViewExample {

    public List<Integer> rightSideView(TreeNode root) {
        return null;
    }

    public static void main(String[] args) {
        $199BinaryTreeRightSideViewExample example = new $199BinaryTreeRightSideViewExample();
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        TreeNode root = TreeNode.build(nums);
        List<Integer> result = example.rightSideView(root);
        System.out.println(result);
    }
}
