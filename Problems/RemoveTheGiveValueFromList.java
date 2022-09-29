package problem;

class RemoveTheGiveValueFromList {

    public static void main(String[] args) {
	int[] list1 = {7, 7, 7, 7};
	ListNode list11 = new ListNode();
	ListNode list111 = list11;
	for(int i = 0; i < list1.length; i++) {
	    if(i != list1.length-1)
		list11.next = new ListNode();
	    list11.val = list1[i];
	    list11 = list11.next;
	}
	removeElements(list111, 7);
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode index = head;
        while(index != null && index.next != null){
            if(index.next.val == val)
        	index.next = index.next.next;
            else
        	index = index.next;
        }
        return head;
    }
}
