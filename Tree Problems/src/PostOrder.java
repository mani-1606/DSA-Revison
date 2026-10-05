import java.util.ArrayList;
import java.util.List;
//lc=145
public class PostOrder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        helper(root,arr);
        return arr;
    }
    private void helper(TreeNode root, List<Integer> arr) {
        if(root == null ) return;
        helper(root.left,arr);
        helper(root.right,arr);
        arr.add(root.val);
    }
}
