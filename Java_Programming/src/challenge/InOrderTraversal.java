package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import generatedata.NodeTree;

public class InOrderTraversal {
	
	public List<Integer> executeInOrderTraversal(NodeTree root) {
		
		List<Integer> result = new ArrayList<>();
		Stack<NodeTree> stack = new Stack<>();
		
		NodeTree current = root;
		
		while (current != null || !stack.isEmpty()) {
			
			while (current != null) {
				stack.push(current);
				current = current.left;
			}
			
			current = stack.pop();
			result.add(current.data);
			
			current = current.right;
			
		}
		
		return result;
		
	}
	
}
