package offer;

/**
 * Created by jiashilin on 2017/5/16.
 */
public class a15_ReverseList {
    public ListNode ReverrseList(ListNode head){
        //判断输入是否正确合法
        //head为当前节点，如果当前节点为空的话，那就什么也不做，直接返回null；
        if (head == null) {
            return null;
        }
        //当前节点是head，pre为当前节点的前一节点，next为当前节点的下一节点
        //需要pre和next的目的是让当前节点从pre->head->next1->next2变成pre<-head next1->next2、
        // 即pre让节点可以反转所指方向，但反转之后如果不用next节点保存next1节点的话，此单链表就此断开了
        // 所以需要用到pre和next两个节点

        ListNode parent = null;
        ListNode next = head.next;
        while(head!=null){
            next = head.next;

            head.next = parent;

            parent = head;
            head =  next;
        }
        //如果head为null的时候，pre就为最后一个节点了，但是链表已经反转完毕，pre就是反转后链表的第一个节点
        //直接输出pre就是我们想要得到的反转后的链表

        return parent;
    }
}
