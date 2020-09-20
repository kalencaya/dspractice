package cn.sliew.dspractice.tree.problem;

/**
 * 104. Maximum Depth of Binary Tree easy
 * tags: Tree, Depth-first Search
 */
public class $104MaximumDepthofBinaryTreeExample {

    public int maxDepth(TreeNode root) {
        return -1;
    }

    public static void main(String[] args) {
        $104MaximumDepthofBinaryTreeExample example = new $104MaximumDepthofBinaryTreeExample();
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.build(nums);
        int result = example.maxDepth(root);
        System.out.println(result);
    }
}
