package offer;

/**
 * Created by jiashilin on 2017/5/16.
 */
//两个指针，先让第一个指针和第二个指针都指向头结点，
// 然后再让第一个指正走(k-1)步，到达第k个节点。然后两个指针同时往后移动，
// 当第一个结点到达末尾的时候，第二个结点所在位置就是倒数第k个节点了。。
public class a14_FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k){
        if (head == null || k==0) {
            return null;
        }
        ListNode a = head;
        ListNode b = head;
        for (int i = 1; i < k ; i++) {
            if (a.next == null) {
                return null;
            }
            a = a.next;
        }
        while(a.next!=null){
            a= a.next;
            b= b.next;
        }
        return b;

    }
}
