package offer;

/**
 * Created by jiashilin on 2017/5/14.
 */
public class a04_reConstructBinaryTree {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        //判断特殊情况，出现不和规则的输入返回null
        if (pre ==null|| in ==null||pre.length==0 || in.length==0||pre.length!=in.length) {
            return null;
        }

        int root = pre[0];
        int leftLength = 0;
        int rightLength = 0;
        //根据root在前序遍历和中序遍历数组中的位置可以判断出左子树和右子树的长度
        for (int i = 0; root!=in[i]; i++) {
            leftLength++;
        }
        rightLength = pre.length - leftLength -1;

        //声明左子树和右子树的前序中序遍历数组
        int[] preLeftTree =new int[leftLength];
        int[] preRightTree =new int[rightLength];
        int[] inLeftTree=new int[leftLength];
        int[] inRightTree=new int[rightLength];

        //分别为左子树和右子树的前序遍历数组和中序遍历数组赋值
        System.arraycopy(pre,1,preLeftTree,0,leftLength);
        System.arraycopy(pre,1+leftLength,preRightTree,0,rightLength);

        System.arraycopy(in,0,inLeftTree,0,leftLength);
        System.arraycopy(in,1+leftLength,inRightTree,0,rightLength);


        //递归调用该方法
        TreeNode treeNode = new TreeNode(root);
        treeNode.left =  reConstructBinaryTree(preLeftTree,inLeftTree);
        treeNode.right = reConstructBinaryTree(preRightTree,inRightTree);

        return treeNode;
    }

    public static void main(String[] args) {
        int[] pre ={1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = reConstructBinaryTree(pre,in);
    }
}
