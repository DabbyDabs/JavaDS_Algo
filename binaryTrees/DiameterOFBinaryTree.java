package binaryTrees;

public class DiameterOFBinaryTree {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
		BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(11);
		BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(12);
		BinaryTreeNode<Integer> node13 = new BinaryTreeNode<>(13);
		BinaryTreeNode<Integer> node14 = new BinaryTreeNode<>(14);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		node5.left = node6;
		node4.right = node11;
		node11.right = node12;
		node12.right = node13;
		node13.right = node14;
		int dia = CalculatesDiameterOfBinaryTree(root);
		System.out.println(dia);
	}

	public static int CalculatesDiameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		int h1 = 0, h2 = 0, dl = 0, dr = 0;
		if (root.left != null) {
			h1 = returnHeightOfBinaryTree(root.left, 0);
			dl = CalculatesDiameterOfBinaryTree(root.left);
		}
		if (root.right != null) {
			h2 = returnHeightOfBinaryTree(root.right, 0);
			dr = CalculatesDiameterOfBinaryTree(root.right);
		}

		return Math.max(Math.max(h1 + h2+1, dl), dr);

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
}
