package cn.sliew.dspractice.tree.problem;

/**
 * 100. Same Tree easy
 * tags: Tree, Depth-first Search
 */
public class $100SameTreeExample {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return false;
    }

    public static void main(String[] args) {
        $100SameTreeExample example = new $100SameTreeExample();
        Integer[] pNums = new Integer[]{2, 1, 3};
        Integer[] qNums = new Integer[]{2, 1, 3};
        TreeNode p = TreeNode.build(pNums);
        TreeNode q = TreeNode.build(qNums);
        boolean result = example.isSameTree(p, q);
        System.out.println(result);
    }
}
