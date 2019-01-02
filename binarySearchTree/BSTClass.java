package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class BSTClass {

	private BinaryTreeNode<Integer> root;

	public void insertData(int data) {
    root=insertHelp(data, root);
	}

	public void deleteData(int data) {

	}

	public boolean hasData(int data) {
		return checkData(data, root);
	}

	private boolean checkData(int data, BinaryTreeNode<Integer> head) {
		if (head == null) {
			return false;
		}
		if (head.data == data) {
			return true;
		}
		if (head.data > data) {

			return checkData(data, head.left);

		}
		if (head.data < data) {
			return checkData(data, head.right);
		}
		return false;
	}

	private static BinaryTreeNode<Integer> insertHelp(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(data);
			root = node;
			return root;
		}
		if (root.data == data) {
			return root;
		}
		if (root.data > data) {
			root.left=insertHelp(data, root.left);
		}
		if (root.data < data) {
		   root.right= insertHelp(data, root.right);
		}
return root;
	}
}
