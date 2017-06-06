package offer;

/**
 * Created by jiashilin on 2017/6/6.
 */
//可以使用递归的思路去求解，把求根节点的深度分解成为求左子树和右子树二者最大的深度+1
public class a38_TreeDepth {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }else{
            return Math.max(TreeDepth(root.left)+1,TreeDepth(root.right)+1);
        }

    }
}
