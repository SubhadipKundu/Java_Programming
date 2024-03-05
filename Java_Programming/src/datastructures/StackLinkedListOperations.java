package datastructures;

import java.util.Random;

public class StackLinkedListOperations {
	
	private Random random = new Random();
	
	ListNode top;
	
	int totalCountount = 0;
	int pushCount = 0;
	int popCount = 0;
	
	public StackLinkedListOperations() {
		this.top = null;
	}
	
	public void executeStackLinkedListOperations() {
		
		do {
			switch (random.nextInt(100) % 5) {
			
			case 1 :
				System.out.println("Operation : Push");
				push(random.nextInt(100));
				break;
			
			case 2 :
				System.out.println("Operation : Pop");
				pop();
				break;
				
			default:
				if (!isStackEmpty()) {
					System.out.println("Operation : Display");
					display();
				}
				break;
			
			}
		} while (random.nextInt(1000) % 333 != 0);
		
		System.out.println("----- * ----- Final Stats ----- * -----");
		System.out.println();
		System.out.println("Total Push Operations : " + pushCount);
		System.out.println("Total Pop Operations : " + popCount);
		System.out.println("Number of element : " + totalCountount);
		display();
		
	}
	
	private void push(int data) {
		
		ListNode node = new ListNode(data);
		
		node.next = top;
		top = node;
		
		pushCount ++;
		totalCountount ++;
		
		System.out.println("Pushed Element : " + data);
		System.out.println();
		
	}
	
	private void pop() {
		
		if (isStackEmpty()) {
			System.out.println("Stack is already empty.");
			System.out.println();
			return;
		}
		
		System.out.println("Popped Element : " + top.data);
		System.out.println();
		top = top.next;
		
		popCount ++;
		totalCountount --;
		
	}
	
	private boolean isStackEmpty() {
		
		if (top == null)
			return true;
		else
			return false;
		
	}
	
	private void display () {
		
		if (isStackEmpty()) {
			System.out.println("Stack is Empty.");
			System.out.println();
			return;
		}
		
		System.out.println("Top Element : " + top.data);
		System.out.println();
		
	}
	
}
