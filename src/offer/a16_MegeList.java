package offer;

/**
 * Created by jiashilin on 2017/5/16.
 */
public class a16_MegeList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        //
        if (list1==null){
            return list2;
        }
        if (list2==null){
            return list1;
        }
        ListNode nowNode = null;
        ListNode head = null;
        //找到头结点
        if (list1.val<=list2.val){
            head = list1;
            list1 = list1.next;
            nowNode = head;
        }else{
            head = list2;
            list2 = list2.next;
            nowNode = head;
        }

        while (list1!=null && list2 !=null ){
            if (list1.val<=list2.val){
               nowNode.next = list1;
               nowNode = nowNode.next;
               list1=list1.next;
            }else{
                nowNode.next = list2;
                nowNode = nowNode.next;
                list2=list2.next;
            }
        }
        if (list1==null){
            nowNode.next = list2;
        }else{
            nowNode.next = list1;
        }
        return head;

    }
}
