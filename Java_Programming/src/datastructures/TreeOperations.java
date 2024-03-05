package datastructures;

import java.util.Random;

public class TreeOperations {
	
	private Random random = new Random();
	
	NodeTree root;
	
	public TreeOperations() {
		this.root = null;
	}
	
	public void executeTreeOperations() {
		
		do {
			switch (random.nextInt(7)) {
			
			case 1 :
				System.out.println("Operation : Insert");
				root = insert(root, random.nextInt(100));
				System.out.println();
				break;
			
			case 2 :
				System.out.println("Operation : Pre-Order Traversal");
				if (!isRootNull()) {
					traversalPreOrder(root);
					System.out.println();
				}
				break;
				
			case 3 :
				System.out.println("Operation : In-Order Traversal");
				if (!isRootNull()) {
					traversalInOrder(root);
					System.out.println();
				}
				break;
				
			case 4 :
				System.out.println("Operation : Post-Order Traversal");
				if (!isRootNull()) {
					traversalPostOrder(root);
					System.out.println();
				}
				break;
			
			default :
				if (!isNodeNull(root)) {
					System.out.println("Root Element : " + root.data);
					System.out.println();
				}
				break;
			
			}
		} while (random.nextInt(1000) % 333 != 0);
		
	}
	
	protected NodeTree insert(NodeTree node, int data) {
		
		if (isNodeNull(node)) {
			System.out.println("Data inserted : " + data);
			return new NodeTree(data);
		}
		else
			if (data == node.data)
				return null;
			if (data < node.data)
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		
		return node;
		
	}
	
	protected void traversalPreOrder(NodeTree node) {
		
		if (isNodeNull(node))
			return;
		
		System.out.println(node.data);
		traversalPreOrder(node.left);
		traversalPreOrder(node.right);
		
	}
	
	protected void traversalInOrder(NodeTree node) {
		
		if (isNodeNull(node))
			return;
		
		traversalInOrder(node.left);
		System.out.println(node.data);
		traversalInOrder(node.right);
		
	}
	
	protected void traversalPostOrder(NodeTree node) {
		
		if (isNodeNull(node))
			return;
		
		traversalPostOrder(node.left);
		traversalPostOrder(node.right);
		System.out.println(node.data);
		
	}
	
	private boolean isNodeNull(NodeTree node) {
		
		if (node == null)
			return true;
		else
			return false;
		
	}
	
	private boolean isRootNull() {
		
		if (isNodeNull(root)) {
			System.out.println("Tree is Empty");
			System.out.println();
			return true;
		} else
			return false;
		
	}
	
}
