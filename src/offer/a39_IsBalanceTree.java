package offer;

/**
 * Created by jiashilin on 2017/6/6.
 */
public class a39_IsBalanceTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        Depth root_dep = new Depth();

        return isbalanced(root,root_dep);
    }
    public class Depth{
        public int dep;
    }

    private boolean isbalanced(TreeNode root,Depth depth){
        if (root == null) {
            depth.dep = 0;
            return true;
        }
        Depth left_dep = new Depth();
        Depth right_dep = new Depth();
        if (isbalanced(root.left,left_dep) &&isbalanced(root.right,right_dep) ) {
            int different = left_dep.dep - right_dep.dep;
            if (Math.abs(different) >1) {
                return false;
            }else{
                depth.dep = Math.max(left_dep.dep,right_dep.dep)+1;
                return true;
            }
        }
        return false;
    }

}
