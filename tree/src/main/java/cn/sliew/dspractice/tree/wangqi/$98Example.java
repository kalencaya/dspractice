package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$98ValidateBinarySearchTreeExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.Optional;

public class $98Example extends $98ValidateBinarySearchTreeExample {

    @Override
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return checkSubTree(root, Optional.empty(), Optional.empty());
    }

    private boolean checkSubTree(TreeNode root, Optional<Integer> lower, Optional<Integer> upper) {
        if (root == null) {
            return true;
        }

        if (lower.isPresent() && lower.get() >= root.val) {
            return false;
        }
        if (upper.isPresent() && upper.get() <= root.val) {
            return false;
        }

        return checkSubTree(root.left, lower, Optional.of(root.val)) &&
                checkSubTree(root.right, Optional.of(root.val), upper);
    }

    public static void main(String[] args) {
        $98ValidateBinarySearchTreeExample example = new $98Example();
        Integer[] nums = new Integer[]{10, 5, 15, null, null, 6, 20};
        TreeNode root = TreeNode.build(nums);
        boolean result = example.isValidBST(root);
        System.out.println(result);
    }

}
