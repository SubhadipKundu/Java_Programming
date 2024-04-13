/* Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center). */

package challenges;

import datastructures.structures.NodeTree;

public class SymetricTree {
	
	public void executeSymetricTree() {
		
		System.out.println(isSymetricTree(null));
		
	}
	
	private boolean isSymetricTree(NodeTree root) {
		
		if (root == null)
			return true;
		
		return new SameTree().executeSameTree(root.left, root.right);
		
	}
	
}
