package bst;

public class binary_search_tree {
	public static void main(String[] args) {
//			  12
//			 / 	\
//		    5    15
//		   / \	   \
//		  1   9     20
//		   \	    /
//		    3      17
//		   / \     / \
//		  2   4  16  19 
		int[] arr = {12, 15, 5, 9, 1, 3, 20, 17, 19, 2, 4, 16};
		TreeNode root = buildBST(arr);
		
		System.out.print("pre-order:");
		preOrder(root);
		System.out.print("\nin-order:");
		inOrder(root);
		System.out.print("\npost-order:");
		postOrder(root);
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
	
	private static void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(" " + root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	private static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(" " + root.val);
			inOrder(root.right);
		}
	}
	
	private static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" " + root.val);
		}
	}
}
