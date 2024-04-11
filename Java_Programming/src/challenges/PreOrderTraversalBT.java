/*
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */

package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import generatedata.NodeTree;

public class PreOrderTraversalBT {
	
	public List<Integer> executePreOrderTraversalBT(NodeTree root) {
		
		List<Integer> result = new ArrayList<>();
		
		if (root == null)
			return result;
		
		Stack<NodeTree> stack = new Stack<>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			NodeTree node = stack.pop();
			result.add(node.data);
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
		}
		
		return result;
		
	}
	
}
