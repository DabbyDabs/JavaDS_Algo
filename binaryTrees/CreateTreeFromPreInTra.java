package binaryTrees;

public class CreateTreeFromPreInTra {

	public static void main(String[] args) {

		int preorder[] = { 1, 2, 3, 4, 15, 5, 6, 7, 8, 10, 9, 12 };
		int inorder[] = { 4, 15, 3, 2, 5, 1, 6, 10, 8, 7, 9, 12 };
		BinaryTreeNode<Integer> head = new BinaryTreeNode<Integer>(preorder[0]);
		head = createTreeFromPreInTra(preorder, inorder);
		printPreorder(head);
		System.out.println();
		printInorder(head);
		System.out.println();
		printShowingChildrenOfBinaryTree(head);

	}

	public static BinaryTreeNode<Integer> createTreeFromPreInTra(int[] preorder, int[] inorder) {
		if (preorder.length == 1) {
			BinaryTreeNode<Integer> curr = new BinaryTreeNode<Integer>(preorder[0]);
			return curr;
		}
		// if(preorder.length==0) { This base case can also be alternatively used!
		// return null;
		// }
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preorder[0]);
		int k = 0;
		while (inorder[k] != preorder[0]) {
			k++;
		}
		int newPreLeft[] = new int[k];
		int newInLeft[] = new int[k];
		for (int i = 0; i < k; i++) {
			newInLeft[i] = inorder[i];
			newPreLeft[i] = preorder[i + 1];

		}
		// for(int i=0;i<newPreLeft.length;i++) {
		// System.out.print(newPreLeft[i]+" ");
		//
		// }
		// System.out.println();
		int newPreRight[] = new int[inorder.length - k - 1];
		int newInRight[] = new int[inorder.length - k - 1];
		int m = 0;
		for (int i = k + 1; i < inorder.length; i++) {
			newInRight[m] = inorder[i];
			newPreRight[m] = preorder[i];
			m++;
		}
		if (newPreLeft.length > 0) {
			root.left = createTreeFromPreInTra(newPreLeft, newInLeft);
		}
		if (newPreRight.length > 0) {
			root.right = createTreeFromPreInTra(newPreRight, newInRight);
		}
		return root;
	}

	public static void printLevelWiseBinaryTree(BinaryTreeNode<Integer> root) {
		int height = returnHeightOfBinaryTree(root, 0);
		int i = 1;
		while (i <= height) {
			printAllRootsAtDepthK(root, i);
			System.out.println();
			i++;
		}

	}

	public static int returnHeightOfBinaryTree(BinaryTreeNode<Integer> root, int height) {
		height++;
		int x = 0;
		int y = 0;
		if (root.left != null) {
			x = returnHeightOfBinaryTree(root.left, 0);
		}
		if (root.right != null) {
			y = returnHeightOfBinaryTree(root.right, 0);
		}
		return Math.max(x, y) + height;
	}

	public static void printAllRootsAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (k == 1) {
			System.out.print(root.data + " ");
		}
		k--;
		if (root.left != null) {
			printAllRootsAtDepthK(root.left, k);
		}
		if (root.right != null) {
			printAllRootsAtDepthK(root.right, k);
		}
	}

	public static void printPreorder(BinaryTreeNode<Integer> root) {
		if (root != null) {
			System.out.print(root.data + " ");
		}
		if (root.left != null) {
			printPreorder(root.left);
		}
		if (root.right != null) {
			printPreorder(root.right);
		}
	}

	public static void printInorder(BinaryTreeNode<Integer> root) {

		if (root.left != null) {
			printInorder(root.left);
		}
		if (root != null) {
			System.out.print(root.data + " ");
		}
		if (root.right != null) {
			printInorder(root.right);
		}
	}

	public static void printShowingChildrenOfBinaryTree(BinaryTreeNode<Integer> root) {
		System.out.print(root.data + " :");
		if (root.left != null) {
			System.out.print(root.left.data + " ");
		}
		if (root.left == null) {
			System.out.print(" noLeftChild ");
		}
		if (root.right != null) {
			System.out.print(root.right.data);
		}
		if (root.right == null) {
			System.out.print(" noRightChild ");
		}
		System.out.println();
		if (root.left != null) {
			printShowingChildrenOfBinaryTree(root.left);
		}
		if (root.right != null) {
			printShowingChildrenOfBinaryTree(root.right);
		}
	}

}
