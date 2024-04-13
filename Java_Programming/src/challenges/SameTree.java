/* Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value. */

package challenges;

import datastructures.structures.NodeTree;

public class SameTree {
	
	public boolean executeSameTree(NodeTree p, NodeTree q) {
		
		if (p == null && q == null)
			return true;
		
		if (p == null || q ==  null)
			return false;
		
		if (p.data != q.data)
			return false;
		
		return executeSameTree(p.left, q.left) && executeSameTree(p.right, q.right);
		
	}
	
}
