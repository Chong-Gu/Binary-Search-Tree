package bst;

public class binary_search_tree {
	public static void main(String[] args) {
		int[] arr = {12, 15, 4, 9, 1, 3, 20, 17, 19, 2, 4, 16};
		TreeNode root = buildBST(arr);
//		System.out.println(root.val);
//		System.out.println(root.left.val);
//		System.out.println(root.right.val);
	}
	
	private static TreeNode buildBST(int[] arr) {
		if (arr.length == 0)
			return null;
		
		TreeNode root = new TreeNode(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			TreeNode curr = root;
			TreeNode newNode = new TreeNode(arr[i]);
			
			while(true) {
				if (newNode.val <= curr.val) {
					if (curr.left == null) {
						curr.left = newNode;
						break;
					}
					else {
						curr = curr.left;
					}
				}
				else {
					if (curr.right == null) {
						curr.right = newNode;
						break;
					}
					else {
						curr = curr.right;
					}
				}
			}
		}
		
		return root;
	}
}
