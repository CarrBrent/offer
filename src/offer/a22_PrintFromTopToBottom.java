package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jiashilin on 2017/5/18.
 */
//从上往下打印出二叉树的每个节点，同层节点从左至右打印。
// 使用一个辅助的Queue存储节点信息。判断队列中是否还有元素存在，如果有就拿出队列的head，并将不为空的左子节点、右子节点依次压入队列
// 队列的声明方法，Queue<Integer> queue = new LinkedList<Integer>();因为Queue是一个抽象类，需要重写里面的各种函数。
// 队列的使用
//            add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
//            remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
//            element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
//            offer       添加一个元素并返回true       如果队列已满，则返回false
//            poll         移除并返问队列头部的元素    如果队列为空，则返回null
//            peek       返回队列头部的元素             如果队列为空，则返回null
//            put         添加一个元素                      如果队列满，则阻塞
//            take        移除并返回队列头部的元素     如果队列为空，则阻塞
public class a22_PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            result.add(node.val);

        }

        return result;
    }
}
