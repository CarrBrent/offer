package offer;

/**
 * Created by jiashilin on 2017/5/17.
 */
public class a17_HasSubTree {
    public boolean HasSubTree(TreeNode root1,TreeNode root2){
        if (root1 == null || root2 == null) {
            return false;
        }
        if(root1.val != root2.val){
            return HasSubTree(root1.left,root2)|| HasSubTree(root1.right,root2);
        }else
            //注意，在val相同的时候，仍然有可能会是has关系
            return IsSubTree(root1,root2)|| HasSubTree(root1.left,root2)|| HasSubTree(root1.right,root2);
    }
    public boolean IsSubTree(TreeNode root1,TreeNode root2){
        if (root2 == null ) {
            return true;
        }else if (root1 == null) {
            return false;
        }else if (root1.val == root2.val) {
            return IsSubTree(root1.left,root2.left) && IsSubTree(root1.right,root2.right);
        }else
            return false;

    }
}
