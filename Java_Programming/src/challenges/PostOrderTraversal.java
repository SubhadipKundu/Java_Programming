package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import datastructures.structures.NodeTree;

public class PostOrderTraversal {
	
	public List<Integer> executePostOrderTraversal(NodeTree root) {
		
		List<Integer> result = new ArrayList<>();
		
		if (root == null)
			return result;
		
		Stack<NodeTree> stack = new Stack<>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			NodeTree node = stack.pop();
			result.add(0,node.data);
			
			if (node.left != null)
				stack.push(node.left);
			
			if (node.right != null)
				stack.push(node.right);
		}
		
		return result;
		
	}
	
}
