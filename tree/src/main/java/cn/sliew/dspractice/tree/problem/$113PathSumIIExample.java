package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 113. Path Sum II medium
 * tags: Tree, Depth-first Search
 */
public class $113PathSumIIExample {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        return null;
    }

    public static void main(String[] args) {
        $113PathSumIIExample example = new $113PathSumIIExample();
        Integer[] nums = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = TreeNode.build(nums);
        int sum = 22;
        List<List<Integer>> result = example.pathSum(root, sum);
        System.out.println(result);
    }
}
