public class BalancedBT {
    //lc=110
    public boolean isBalanced(TreeNode root) {
      if(root==null) return true;
      int left = level(root.left);
      int right = level(root.right);
      if(Math.abs(left-right)>1) return false;
      return isBalanced(root.left) && isBalanced(root.right);
    }

    private int level(TreeNode root) {
        if(root == null ) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
}
