//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

package datastructures;

public class RemoveDuplicates {
	
	LinkedListOperaions list = new LinkedListOperaions();
	
	public void executeRemoveDuplicates() {
		
		list.insert(1);
		list.insert(1);
		list.insert(2);
		
		remove(list.head);
		
	}
	
	private void remove(ListNode node) {
		
		if (node == null || node.next == null)
			return;
		
		ListNode currentNode = node;
		
		while (currentNode != null && currentNode.next != null) {
			
			if (currentNode.data == currentNode.next.data)
				currentNode.next = currentNode.next.next;
			else
				currentNode = currentNode.next;
			
		}
		
	}
	
}
