public class MaxDepthOfBinaryTree {
        public int maxDepth(TreeNode A) {
            if(A == null) {
                return 0;
            }
            int lDepth = maxDepth(A.left);
            int rDepth = maxDepth(A.right);
            return Math.max(lDepth, rDepth) + 1;
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
