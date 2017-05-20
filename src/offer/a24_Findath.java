package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/5/20.
 */
//输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
// 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
//
// 通过深度遍历的方式进行检索，每走一步，将toot.val加入到路径中。
// 用target减去root.val，如果左右子节点都是null而且target==0则返回当前路径。在回溯的过程中要记得将list最后一个元素删掉。


public class a24_Findath {
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return result;
        }

        list.add(root.val);
        target = target-root.val;
        if (target==0 && root.left==null && root.right==null ) {
            result.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        list.remove(list.size()-1);
        return result;
    }

    public static void main(String[] args) {

    }



}
