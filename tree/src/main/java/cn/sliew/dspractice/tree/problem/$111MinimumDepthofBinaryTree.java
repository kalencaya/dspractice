package cn.sliew.dspractice.tree.problem;

/**
 * 111. Minimum Depth of Binary Tree easy
 * tags: Tree, Depth-first Search, Breadth-first Search
 */
public class $111MinimumDepthofBinaryTree {

    public int minDepth(TreeNode root) {
        return -1;
    }

    public static void main(String[] args) {
        $111MinimumDepthofBinaryTree example = new $111MinimumDepthofBinaryTree();
        Integer[] nums = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.build(nums);
        int result = example.minDepth(root);
        System.out.println(result);
    }
}
