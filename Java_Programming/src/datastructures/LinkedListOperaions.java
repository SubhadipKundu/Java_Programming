package datastructures;

import java.util.Random;

public class LinkedListOperaions {
	
	private Random random = new Random();
	
	ListNode head;
	
	public LinkedListOperaions() {
		this.head = null;
	}
	
	public void executeLinkedListOperaions() {
		
		do {
			switch (random.nextInt(100) % 5) {
			
			case 1 :
				System.out.println("Operation : Insert");
				insert(random.nextInt(100));
			
			case 2 :
				System.out.println("Operation : Delete");
				delete(random.nextInt(100));
			
			default :
				if (!isListEmpty())
					display();
			
			}
		} while (random.nextInt(100) % 3 != 0);
		
		display();
		
	}
	
	protected void insert(int data) {
		
		ListNode node = new ListNode(data); 
		
		if (head == null) {
			head = node;
			return;
		}
		
		ListNode current = head;
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = node;
		
	}
	
	protected void delete(int data) {
		
		System.out.println("Element to be deleted : " + data);
		
		ListNode current = head;
		ListNode previous = null;
		
		if (isListEmpty()) {
			System.out.println("Linked list is already empty.");
			return;
		}
		
		if (current.data == data && current.next != null) {
			head = current.next;
			return;
		}
		
		while (current != null && current.data != data) {
			previous = current;
			current = current.next;
		}
		
		if (current == null) {
			System.out.println("Element " + data + " not found in linked list.");
			System.out.println();
			return;
		}
		
		previous.next = current.next;
		
		
	}
	
	private boolean isListEmpty() {
		
		if (head == null)
			return true;
		else
			return false;
		
	}
	
	private void display() {
		
		if (isListEmpty()) {
			System.out.println("List is empty");
			return;
		}
		
		ListNode current = head;
		
		System.out.print("Linked List : [");
		
		while (current.next != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		
		System.out.println(current.data + "]");
		System.out.println();
		
	}
	
}
