package problem;

class MergeToSortedList {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	ListNode headNode;
	if(list1.val < list2.val) {
	    headNode = list1;
	    list1 = headNode.next;
	    headNode.next = null;
	}else {
	    headNode = list2;
	    list2 = headNode.next;
	    headNode.next = null;
	}
	ListNode temp = headNode;
	while(true) {
	    if(list1 == null && list2 == null) {
		return headNode;
	    }else if(list1 == null) {
		temp.next = list2;
		list2 = list2.next;
		temp = temp.next;
	    }else if(list2 == null) {
		temp.next = list1;
		list1 = list1.next;
		temp = temp.next;
	    }else {
		if(list1.val < list2.val) {
		    temp.next = list1;
		    list1 = list1.next;
		    temp = temp.next;
		}else {
		    temp.next = list2;
		    list2 = list2.next;
		    temp = temp.next;
		}
	    }
	}
        }
    public static void main(String[] args) {
	int[] list1 = {1, 2, 4};
	int[] list2 = {1, 3, 4};
	ListNode list11 = new ListNode();
	ListNode list111 = list11;
	ListNode list22 = new ListNode();
	ListNode list222 = list22;
	for(int i = 0; i < list1.length; i++) {
	    if(i != list1.length-1)
		list11.next = new ListNode();
	    list11.val = list1[i];
	    list11 = list11.next;
	}
	for(int i = 0; i < list2.length; i++) {
	    if(i != list2.length-1)
		list22.next = new ListNode();
	    list22.val = list2[i];
	    list22 = list22.next;
	}
	ListNode headNode = mergeTwoLists(list111, list222);
    }
}
