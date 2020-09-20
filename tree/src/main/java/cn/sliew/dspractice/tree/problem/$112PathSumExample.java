package cn.sliew.dspractice.tree.problem;

/**
 * 112. Path Sum easy
 * tags: Tree, Depth-first Search
 */
public class $112PathSumExample {

    public boolean hasPathSum(TreeNode root, int sum) {
        return false;
    }

    public static void main(String[] args) {
        $112PathSumExample example = new $112PathSumExample();
        Integer[] nums = new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = TreeNode.build(nums);
        int sum = 22;
        boolean result = example.hasPathSum(root, sum);
        System.out.println(result);
    }
}
