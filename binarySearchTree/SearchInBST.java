package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class SearchInBST {

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
		
		System.out.println(searchInBST(node4, 7));
	}

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return false;
		}
		if (root.data == k) {
			return true;
		}
		if (root.data > k) {
			return searchInBST(root.left, k);
		} else {
			return searchInBST(root.right, k);
		}
	}
	
}
