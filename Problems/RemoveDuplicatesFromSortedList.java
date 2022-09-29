package problem;


class RemoveDuplicatesFromSortedList {
    static ListNode deleteDuplicates(ListNode head) {
	if(head == null)
	    return null;
	else if(head.next == null)
	    return head;
	ListNode temp = head;
	while(true) {
	    if(temp.next == null) {
		return head;
	    }else if(temp.val == temp.next.val) {
		temp.next = temp.next.next;
	    }else if(temp.val != temp.next.val) {
		temp = temp.next;
	    }
	}
    }
    public static void main(String[] args) {
	
	int[] list1 = {1, 2, 4, 4, 4, 5, 6, 7, 7, 8};
	ListNode list11 = new ListNode();
	ListNode list111 = list11;
	for(int i = 0; i < list1.length; i++) {
	    if(i != list1.length-1)
		list11.next = new ListNode();
	    list11.val = list1[i];
	    list11 = list11.next;
	}
	deleteDuplicates(list111);
    }

}
