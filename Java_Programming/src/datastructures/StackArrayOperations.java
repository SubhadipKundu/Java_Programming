package datastructures;

import java.util.Random;

public class StackArrayOperations {
	
	private Random random = new Random();
	
	int[] stack = new int[random.nextInt(100)];
	int size = stack.length;
	int top = -1;
	int pushCount = 0;
	int popCount = 0;
	
	public void executeStackArrayOperations() {
		
		if (size == 0) {
			System.out.println("Stack size is 0.");
			return;
		}
		
		System.out.println("Stack : " + size);
		System.out.println();
		
		do {
			switch (random.nextInt(100) % 5) {
			
			case 1 :
				System.out.println("Operation : Push");
				push();
				break;
			
			case 2 :
				System.out.println("Operation : Pop");
				pop();
				break;
			
			default :
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
		System.out.println("Number of elements : " + top ++);
		display();
		
	}
	
	private void push() {
		
		if (top == size - 1) {
			System.out.println("Stack is full");
		} else {
			top ++;
			pushCount ++;
			System.out.print("Pushed Element : ");
			System.out.println(stack[top] = random.nextInt(100));
			System.out.println();
		}
		
	}
	
	private void pop() {
		
		if (isStackEmpty()) {
			System.out.println("Stack is already empty.");
			System.out.println();
		} else {
			System.out.println("Popped Element : " + stack [top]);
			System.out.println();
			top --;
			popCount ++;
		}
		
	}
	
	private boolean isStackEmpty() {
		
		if (top == -1)
			return true;
		else
			return false;
		
	}
	
	private void display() {
		
		if (isStackEmpty()) {
			System.out.println("Stack is empty.");
			System.out.println();
			return;
		}
		
		System.out.println("Top Element : " + stack[top]);
		System.out.println();
		
	}
	
}
