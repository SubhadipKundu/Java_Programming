package application;

import challenge.InOrderTraversal;
import generatedata.NodeTree;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeTree root = new NodeTree(1);
		root.right = new NodeTree(2);
		root.right.left = new NodeTree(3);
		
		System.out.println(new InOrderTraversal().executeInOrderTraversal(root));
		
	}

}
