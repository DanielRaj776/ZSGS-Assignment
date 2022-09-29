package problem;

class AddTwoLinkNumbers {
    
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode index = null;
        ListNode headNode = null;
        int carry = 0;
        while(l1 != null || l2 != null){
            int sumOfNum = 0;
            if(l1 == null){
                sumOfNum = l2.val + carry;
                l2 = l2.next;
            }else if(l2 == null){
                sumOfNum = l1.val + carry;
                l1 = l1.next;
            }else{
                sumOfNum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }
            carry = sumOfNum / 10;
            sumOfNum %= 10;
            if(headNode == null) {
            index = new ListNode(sumOfNum);
            headNode = index;
            }else {
        	index.next = new ListNode(sumOfNum);
        	index = index.next;
            }
            if(l1 == null && l2 == null){
                if(carry != 0){
                    index.next = new ListNode(carry);
                }
            }
        }
        return headNode;
    }
    
    public static void main(String[] args) {
	
	int[] list1 = {1, 2, 4};
	int[] list2 = {1, 9, 4};
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
	ListNode headNode = addTwoNumbers(list111, list222);
	
    }

}
