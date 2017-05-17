package offer;

import sun.reflect.generics.tree.Tree;

/**
 * Created by jiashilin on 2017/5/17.
 */
//递归的思路去考虑就好了
public class a18_MirrorTree {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        Mirror(root.left);
        Mirror(root.right);

    }
}
