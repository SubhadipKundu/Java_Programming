/* Given a binary tree, determine if it is height-balanced. */

package challenges;

import generatedata.NodeTree;

public class BalancedBinaryTree {
	
	public boolean executeBalancedBinaryTree(NodeTree root) {
		
		return checkHeight(root) != -1;
		
	}
	
	private int checkHeight(NodeTree node) {
		
		if (node == null)
			return 0;
		
		int leftHeight = checkHeight(node.left);
		if (leftHeight == -1)
			return -1;
		
		int rightHeight = checkHeight(node.right);
		if (rightHeight == -1)
			return -1;
		
		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		
		return Math.max(leftHeight, rightHeight) + 1;
		
	}
	
}
