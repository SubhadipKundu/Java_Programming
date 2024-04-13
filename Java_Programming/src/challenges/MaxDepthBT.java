/* Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node. */

package challenges;

import datastructures.structures.NodeTree;

public class MaxDepthBT {
	
	public int executeMaxDepthBT(NodeTree root) {
		
		if (root == null)
			return 0;
		
		int leftDepth = executeMaxDepthBT(root.left);
		int rightDepth = executeMaxDepthBT(root.right);
		
		return Math.max(leftDepth, rightDepth) + 1;
		
	}
	
}
