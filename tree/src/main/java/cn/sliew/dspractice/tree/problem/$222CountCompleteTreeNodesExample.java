package cn.sliew.dspractice.tree.problem;

/**
 * 222. Count Complete Tree Nodes medium
 * tags: Tree, Binary Search
 */
public class $222CountCompleteTreeNodesExample {

    public int countNodes(TreeNode root) {
        return -1;
    }

    public static void main(String[] args) {
        $222CountCompleteTreeNodesExample example = new $222CountCompleteTreeNodesExample();
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5, 6};
        TreeNode root = TreeNode.build(nums);
        int result = example.countNodes(root);
        System.out.println(result);
    }
}
