package offer;

/**
 * Created by jiashilin on 2017/5/20.
 */

//题目描述
//输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
// 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
//
//思路：1.使用hash表，将父节点和随机子节点进行关联，用O（1）的时间去查询随机子节点的位置。先复制主干，在根据hash表里的关系复制随机子节点。
//    2.将每个节点复制一份，插入到原节点的后面，这样原节点A和复制节点A1都指向原节点的随机子节点S。实际上复制节点的随机子节点是S1，
//      而S1就是S.next。最后再将两个链表分离开就好了（调整Next的指向）。
public class a25_RandomListNodeClone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) {
            return null;
        }
        //拷贝节点，并插入到下一位置
        RandomListNode now = pHead;
        while (now!=null) {
            RandomListNode copy = new RandomListNode(now.label);
            copy.next=now.next;
            copy.random=now.random;
            now.next = copy;
            now = copy.next;
        }
        //完善复制节点的随机子节点
        now = pHead;
        while (now!=null){
            if (now.random != null) {
                now.random = now.random.next;
            }
            now = now.next.next;
        }
        //原节点和复制节点分离。
        RandomListNode head = pHead.next;
        RandomListNode cur = head;
        now = pHead;
        //拆分链表
        while(now!=null){
            now.next = now.next.next;
            if(cur.next!=null)
                cur.next = cur.next.next;
            cur = cur.next;
            now = now.next;
        }
        return head;
    }

}
