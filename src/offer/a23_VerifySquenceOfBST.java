package offer;


import java.util.Arrays;

/**
 * Created by jiashilin on 2017/5/19.
 */

     //二叉搜索树的后续遍历
    //输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。
    // 假设输入的数组的任意两个数字都互不相同。
    //
    //解题思路：递归实现，二叉搜索树的后续遍历是最后一个数是root
    // 剩下的分成两部分，前一部分都是<root,后一部分都是>root
public class a23_VerifySquenceOfBST {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        //判断特殊情况
        if (sequence == null) {
            return true;
        }
        int length = sequence.length;

        if (length == 1 ) {
            return true;
        }
        if ( length ==0) {
            return false;
        }
        return verify(sequence);


    }
    public static boolean verify(int [] sequence){
        int length = sequence.length;
        if (length == 1 || length ==0) {
            return true;
        }
        //找到左子树和右子树的分界点
        int root = sequence[length-1];
        int i = length-2;
        for (;i>=0 && sequence[i]>= root; i--) {

        }
        for (int j = i;  j>=0 ; j--){
            if (sequence[j] >root) {
                return false;
            }
        }
        int[] left = new int[i+1];
        int[] right = new int [length-1-(i+1)];
        System.arraycopy(sequence,0,left,0,i+1);
        System.arraycopy(sequence,i+1,right,0,length-1-(i+1));
        return verify(left)&&verify(right);

    }


    public static void main(String[] args) {
        int [] root = {5,4,3,2,1};
        System.out.println(VerifySquenceOfBST(root));
    }
}
