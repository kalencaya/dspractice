package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal medium
 * tags: Array, Tree, Depth-first Search
 */
public class $105ConstructBinaryTreefromPreorderandInorderTraversalExample {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return null;
    }

    public static void main(String[] args) {
        $105ConstructBinaryTreefromPreorderandInorderTraversalExample example =
                new $105ConstructBinaryTreefromPreorderandInorderTraversalExample();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = example.buildTree(preorder, inorder);

        $102BinaryTreeLevelOrderTraversalExample levelTraversal =
                new $102BinaryTreeLevelOrderTraversalExample();
        List<List<Integer>> result = levelTraversal.levelOrder(root);
        System.out.println(result);
    }
}
