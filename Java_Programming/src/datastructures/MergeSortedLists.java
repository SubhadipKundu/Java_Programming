//To merge two sorted linked lists

package datastructures;

public class MergeSortedLists {
	
	LinkedListOperaions list1 = new LinkedListOperaions();
	LinkedListOperaions list2 = new LinkedListOperaions();
	
	public void executeMergeSortedLists() {
		
		list1.insert(1);
		list1.insert(2);
		list1.insert(4);
		
		list2.insert(1);
		list2.insert(3);
		list2.insert(4);
		
		mergeLists(list1.head, list2.head);
		
	}
	
	private void mergeLists(ListNode node1, ListNode node2) {
		
		ListNode result = new ListNode(-1);
		ListNode current = result;
		
		while (node1 != null && node2 != null) {
			
			if (node1.data < node2.data) {
				current.next = node1;
				node1 = node1.next;
			} else {
				current.next = node2;
				node2 = node2.next;
			}
			
			current = current.next;
			
		}
		
		if (node1 != null)
			current.next = node1;
		
		if (node2 != null)
			current.next = node2;
		
		displayResult(result.next);
		
	}
	
	private void  displayResult(ListNode node) {
		
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}
	
}
