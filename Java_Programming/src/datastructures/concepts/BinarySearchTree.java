package datastructures.concepts;

import datastructures.structures.NodeTree;

public class BinarySearchTree {
	
	public void displayBST(NodeTree root) {
		
		if (root == null)
			return;
		
		displayBST(root.left);
		System.out.println(root.data);
		displayBST(root.right);
		
	}
	
}
