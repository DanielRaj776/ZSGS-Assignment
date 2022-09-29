package problem;

import java.util.HashSet;
import java.util.Set;

class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    boolean hasCycle(ListNode head) {
	if(head == null)
	    return false;
	Set<ListNode> set = new HashSet<LinkedListCycle.ListNode>();
	set.add(head);
	
	while(head.next != null) {
	    if(set.contains(head.next))
		    return true;
		else {
		    set.add(head.next);
		    head = head.next;
		}
	}
	return false;
    }
}