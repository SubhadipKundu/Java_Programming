/*
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
 *
 * A leaf is a node with no children.
 */

package challenges;

import datastructures.structures.NodeTree;

public class PathSum {
	
	public boolean executePathSum(NodeTree root, int targetSum) {
		
		if (root == null)
			return false;
		
		if (root.left == null && root.right == null)
			return targetSum == root.data;
		
		boolean leftPath = false;
		boolean rightPath = false;
		
		if (root.left != null)
			leftPath = executePathSum(root.left, targetSum - root.data);
		
		if (root.right != null)
			rightPath = executePathSum(root.right, targetSum - root.data);
		
		return leftPath || rightPath;
		
	}
	
}
