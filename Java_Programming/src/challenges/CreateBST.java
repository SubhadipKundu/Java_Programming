package challenges;

import datastructures.structures.NodeTree;

public class CreateBST {
	
	public NodeTree executeCreateBST(int[] arr) {
		if (arr == null || arr.length == 0)
			return null;
		
		return buildBST(arr, 0, arr.length - 1);
	}
	
	private NodeTree buildBST(int[] arr, int start, int end) {
		
		if (start > end)
			return null;
		
		int mid = start + (end - start) / 2;
		NodeTree root = new NodeTree(arr[mid]);
		
		root.left = buildBST(arr, start, mid - 1);
		root.right = buildBST(arr, mid + 1, end);
		
		return root;
		
	}
	
}
