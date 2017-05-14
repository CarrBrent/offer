package leetcode;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class SortList {
	
	public static void main(String[] args) {
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(4);
		a.next= b;
		b.next= c;
		System.out.println(sortList(a));
		
	}

	public static ListNode sortList(ListNode head) {
		if (head==null || head.next==null) {
			return head;
		}
		//�ҵ������м�ڵ�
		ListNode fastNode= head.next;
		ListNode slowNode= head;
		while (fastNode!=null&&fastNode.next!=null) {
			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}
		//��������м�ض�
		ListNode rightHead=slowNode.next;
		slowNode.next=null;

		//�ֱ�ݹ���������µ�����
		ListNode left = sortList(head);
		ListNode right = sortList(rightHead);

		//��������������
		return mergeList(left, right);

	}
	public static ListNode mergeList(ListNode left,ListNode right) {
		if(left==null)
			return right;
		if(right==null)
			return left;
		ListNode head = null;
		if(left.val>right.val){
			head = right;
			right = right.next;
		}else{
			head = left;
			left = left.next;
		}
		ListNode temp = head;
		while(right!=null&&left!=null){
			if(left.val>right.val){
				temp.next = right;
				right = right.next;
			}else{
				temp.next = left;
				left = left.next;
			}
			temp = temp.next;
		}
		if(right!=null){
			temp.next = right;
		}
		if(left!=null){
			temp.next = left;
		}
		return head;

	}


}
