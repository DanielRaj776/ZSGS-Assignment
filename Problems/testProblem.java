package problem;

class testProblem {
    static public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode firstAddress = head;
        ListNode secondAddress = head.next;
        ListNode thirdAddress = head.next.next;
        ListNode index = head;
        do{
            if(index == head){
                index = index.next;
                head.next = null;
            }
            index.next = firstAddress;
            firstAddress = secondAddress;
            secondAddress = thirdAddress;
            if(thirdAddress == null)
                break;
            thirdAddress = thirdAddress.next;
            index = secondAddress;
        }while(true);
        return index;
    }
    static public int pairSum(ListNode head) {
        if(head == null)
            return 0;
        int n = 1;
        int max = 0;
        ListNode temp = head;
        while(temp.next != null){
            n++;
            temp = temp.next;
        }
        temp = head;
        n = n / 2;
        while(n > 0){
            temp = temp.next;
            n--;
        }
        ListNode newHead = reverseList(temp);
        System.out.println(temp.val);
        System.out.println(newHead);
         while(newHead.next != null){
             if(max < (head.val + newHead.val))
                 max = (head.val + newHead.val);
             head = head.next;
             newHead = newHead.next;
         }
        return max;
    }
    public static void main(String[] args) {
	int[] list1 = {1, 2, 4, 5, 6, 7};
	ListNode list11 = new ListNode();
	ListNode list111 = list11;
	for(int i = 0; i < list1.length; i++) {
	    if(i != list1.length-1)
		list11.next = new ListNode();
	    list11.val = list1[i];
	    list11 = list11.next;
	}
	pairSum(list111);
    }

}
