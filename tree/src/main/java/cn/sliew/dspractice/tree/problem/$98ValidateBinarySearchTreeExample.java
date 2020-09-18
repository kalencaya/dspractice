package cn.sliew.dspractice.tree.problem;

/**
 * 98. Validate Binary Search Tree medium
 * tags: Tree, Depth-first Search
 */
public class $98ValidateBinarySearchTreeExample {

    public boolean isValidBST(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        $98ValidateBinarySearchTreeExample example = new $98ValidateBinarySearchTreeExample();
        Integer[] nums = new Integer[]{2, 1, 3};
        TreeNode root = TreeNode.build(nums);
        boolean result = example.isValidBST(root);
        System.out.println(result);
    }
}

