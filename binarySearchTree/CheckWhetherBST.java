package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class CheckWhetherBST {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(7);
		BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(8);
		node4.left = node2;
		node2.left = node1;
		node2.right = node3;
		node4.right = node6;
		node6.left = node5;
		node6.right = node7;
		node7.right = node8;
		System.out.println(checkWhetherBST(node4).isBST);
	}

	public static CheckBSTobj checkWhetherBST(BinaryTreeNode<Integer> root) {
		if (root==null) {
			CheckBSTobj b = new CheckBSTobj();
			return b;
		}
		CheckBSTobj b1 = new CheckBSTobj();
		CheckBSTobj b2 = new CheckBSTobj();
		if (root.left != null) {
			b1 = checkWhetherBST(root.left);
		}
		if (root.right != null) {
			b2 = checkWhetherBST(root.right);
		}
		CheckBSTobj result = new CheckBSTobj();
		result.isBST = false;
		result.max = Math.max(root.data, Math.max(b1.max, b2.max));
		result.min = Math.min(root.data, Math.min(b1.min, b2.min));
		if (root.left != null) {
			if (b1.isBST == false) {
				result.isBST = false;
				return result;
			}
			if (root.data < b1.max) {
				result.isBST = false;
				return result;
			}
		}
		if (root.right != null) {
			if (b2.isBST == false) {
				result.isBST = false;
				return result;
			}

			if (root.data > b2.min) {
				result.isBST = false;
				return result;
			}
		}
		result.isBST = true;
		return result;
	}
}
