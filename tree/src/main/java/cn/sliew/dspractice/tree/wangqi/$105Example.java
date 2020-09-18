package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$102BinaryTreeLevelOrderTraversalExample;
import cn.sliew.dspractice.tree.problem.$105ConstructBinaryTreefromPreorderandInorderTraversalExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.List;

public class $105Example extends $105ConstructBinaryTreefromPreorderandInorderTraversalExample {

    @Override
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        TreeNode root = new TreeNode(preorder[0]);

        int inOrderRootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[0]) {
                inOrderRootIndex = i;
                break;
            }
        }
        int[] leftInorder = new int[inOrderRootIndex];
        System.arraycopy(inorder, 0, leftInorder, 0, leftInorder.length);
        int[] rightInorder = new int[inorder.length - 1 - inOrderRootIndex];
        System.arraycopy(inorder, inOrderRootIndex + 1, rightInorder, 0, rightInorder.length);

        int[] leftPreorder = new int[leftInorder.length];
        System.arraycopy(preorder, 1, leftPreorder, 0, leftPreorder.length);
        int[] rightPreorder = new int[rightInorder.length];
        System.arraycopy(preorder, 1 + leftPreorder.length, rightPreorder, 0, rightPreorder.length);
        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);
        return root;
    }


    public static void main(String[] args) {
        $105ConstructBinaryTreefromPreorderandInorderTraversalExample example = new $105Example();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = example.buildTree(preorder, inorder);

        $102BinaryTreeLevelOrderTraversalExample levelTraversal = new $102Example();
        List<List<Integer>> result = levelTraversal.levelOrder(root);
        System.out.println(result);
    }
}
