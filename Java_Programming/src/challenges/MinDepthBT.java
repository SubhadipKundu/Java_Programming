package challenges;

import datastructures.structures.NodeTree;

public class MinDepthBT {
	
	public int executeMinDepthBT(NodeTree root) {
		
		if (root == null)
			return 0;
		
		if (root.left == null && root.right == null)
			return 1;
		
		if (root.left == null)
			return executeMinDepthBT(root.right) + 1;
		
		if (root.right == null)
			return executeMinDepthBT(root.left) + 1;
		
		return Math.min(executeMinDepthBT(root.left), executeMinDepthBT(root.right)) + 1;
		
	}
	
}
