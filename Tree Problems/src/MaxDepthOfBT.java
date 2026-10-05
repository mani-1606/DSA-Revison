public class MaxDepthOfBT {
    //lc=104
    public int maxDepth(TreeNode root) {
       int result = helper(root);
       return result;
    }

    private int helper(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(helper(root.left), helper(root.right));
    }
}
