package offer;

import java.util.ArrayList;

/**
 * Created by jiashilin on 2017/5/13.
 */
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
/*
首先，该问题有两种思路，第一种是使用栈来存储，依次将链表中的数据存入栈中，然后从栈中弹出就获得了倒序结果。
第二种思路是使用递归的方式去查询，每次先递归调用，再把数据加入list

 */
public class a03_PrintListFromTailToHead {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);

        }
        return list;


    }
}
