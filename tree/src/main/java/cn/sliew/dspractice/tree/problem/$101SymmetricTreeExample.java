package cn.sliew.dspractice.tree.problem;

/**
 * 101. Symmetric Tree easy
 * tags: Tree, Depth-first Search, Breadth-first Search
 */
public class $101SymmetricTreeExample {

    public boolean isSymmetric(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        $101SymmetricTreeExample example = new $101SymmetricTreeExample();
        Integer[] nums = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        TreeNode root = TreeNode.build(nums);
        boolean result = example.isSymmetric(root);
        System.out.println(result);
    }
}
