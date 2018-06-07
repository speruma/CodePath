public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode A) {

        if(A != null) {

            invertTree(A.left);
            invertTree(A.right);
            TreeNode temp = A.left;
            A.left = A.right;
            A.right = temp;
        }

        return A;

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }
}
