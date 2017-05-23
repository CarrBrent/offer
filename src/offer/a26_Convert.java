package offer;

/**
 * Created by jiashilin on 2017/5/23.
 */

/**
 * //
 1.找到树的最左边的叶节点，即链表的头结点
 2.使用递归的方式去做，将左右子树的转换想象成另一个相同的子问题。但是在编写递归方法时，
 可以先把子树转化成链表，但是返回的时候依旧返回子树的root节点，
 根据不同的需要去查找root最左边的头和最右边的尾。
 */
public class a26_Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return pRootOfTree;
        }
        TreeNode head= ConvertNode(pRootOfTree);
        while(head.left!=null){
            head = head.left;
        }
        return head;

    }
    public TreeNode ConvertNode(TreeNode root){
        if(root==null) return root;
        if(root.left!=null) {
            TreeNode left = ConvertNode(root.left);
            while(left.right!=null) left = left.right;
            left.right = root;
            root.left = left;
        }
        if(root.right!=null)
        {
            TreeNode right = ConvertNode(root.right);
            while(right.left!=null) right = right.left;
            right.left = root;
            root.right = right;
        }
        return root;
    }

}
