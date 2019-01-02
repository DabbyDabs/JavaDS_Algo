package binaryTrees;

import binarySearchTree.TwoIntObj;

public class DiameterBetter {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);
		BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);
		BinaryTreeNode<Integer> node9 = new BinaryTreeNode<>(9);
		BinaryTreeNode<Integer> node10 = new BinaryTreeNode<>(10);
		BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(11);
		BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(12);
		node4.left = node2;
		node2.left = node1;
		node2.right = node3;
		node4.right = node6;
		node6.left = node5;
		node6.right = node7;
		node7.right = node8;
		node5.left = node9;
		node9.left = node10;
		node10.left = node11;
		node11.left = node12;
		System.out.println(helperFunction(node4));
		System.out.println(CalculatesDiameterOfBinaryTree(node4));

	}

	public static int helperFunction(BinaryTreeNode<Integer> root) {
		TwoIntObj messenger = new TwoIntObj();
		messenger = diameterBetter(root, messenger);
		int diameter = messenger.var1;
		return diameter;

	}

	public static TwoIntObj diameterBetter(BinaryTreeNode<Integer> root, TwoIntObj messenger) {
		int lh = 0;
		int rh = 0;
		int ld = 0;
		int rd = 0;
		if (root.left == null && root.right == null) {
			messenger.var2++;
			return messenger;
		}
		if (root.left != null) {
			TwoIntObj leftData = new TwoIntObj();
			leftData = diameterBetter(root.left, messenger);
			ld = leftData.var1;
			lh = leftData.var2;
		}
		if (root.right != null) {
			TwoIntObj rightData = new TwoIntObj();
			messenger.var1 = 0;
			messenger.var2 = 0;
			rightData = diameterBetter(root.right, messenger);
			rd = rightData.var1;
			rh = rightData.var2;
		}
		messenger.var1 = Math.max(lh + rh + 1, Math.max(ld, rd));
		messenger.var2=Math.max(lh,rh)+1;
		return messenger;
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

		return Math.max(Math.max(h1 + h2 + 1, dl), dr);

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
