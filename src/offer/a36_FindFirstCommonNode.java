package offer;

/**
 * Created by jiashilin on 2017/6/6.
 */
/*
找出2个链表的长度，然后让长的先走两个链表的长度差，然后再一起走
（因为2个链表用公共的尾部）
*/
public class a36_FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null||pHead2 ==null) {
            return null;
        }
        int length1 = 1;
        int length2 = 1;
        int n=0;
        ListNode node1 = pHead1;
        ListNode node2 = pHead2;
        while (node1.next !=null){
            length1++;
            node1 = node1.next;
        }
        while (node2.next !=null){
            length2++;
            node2 = node2.next;
        }
        if (length1 <= length2) {
            n = length2-length1;
            for (int i = 0; i <n ; i++) {
                pHead2 = pHead2.next;
            }
        }else{
            n=length1-length2;
            for (int i = 0; i <n ; i++) {
                pHead1 = pHead1.next;
            }
        }
        while (pHead1 != pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;


    }
}
