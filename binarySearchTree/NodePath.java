package binarySearchTree;

import java.util.ArrayList;

import binaryTrees.BinaryTreeNode;

public class NodePath {

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
		// ArrayList<Integer> l = new ArrayList<Integer>();
		// l.add(1);
		// l.add(2);
		// l.add(3);
		// System.out.println(l.size());
		// System.out.println(l.get(l.size() - 1));
		returnNodePathHelperfun(node4, 1);
	}

	public static void returnNodePathHelperfun(BinaryTreeNode<Integer> root, int k) {
		ArrayList<BinaryTreeNode<Integer>> list = new ArrayList<BinaryTreeNode<Integer>>();
		list = returnNodePathForBST(root, list, k);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).data);
		}
	}

	public static ArrayList<BinaryTreeNode<Integer>> returnNodePathForAnyBinaryTree(BinaryTreeNode<Integer> root,
			ArrayList<BinaryTreeNode<Integer>> list, int k) {
		if (root.data == k) {
			list.add(root);
			return list;
		}
		if (root.left == null && root.right == null) {
			return list;
		}
		list.add(root);

		if (root.left != null)
			list = returnNodePathForAnyBinaryTree(root.left, list, k);
		if (list.get(list.size() - 1).data == k) {
			return list;
		}
		while (list.get(list.size() - 1) != root) {
			list.remove(list.size() - 1);
		}
		if (root.right != null) {
			list = returnNodePathForAnyBinaryTree(root.right, list, k);
		}
		if (list.get(list.size() - 1).data == k) {
			return list;
		}
		while (list.get(list.size() - 1) != root) {
			list.remove(list.size() - 1);
		}
		list.remove(list.size() - 1);
		return list;
	}

	public static ArrayList<BinaryTreeNode<Integer>> returnNodePathForBST(BinaryTreeNode<Integer> root,
			ArrayList<BinaryTreeNode<Integer>> list, int k) {
		if (root.data == k) {
			list.add(root);
			return list;
		}
		if (root.left == null && root.right == null) {
			return list;
		}
		list.add(root);
		if (k < root.data) {
			list = returnNodePathForBST(root.left, list, k);
		}
		if (k > root.data) {
			list = returnNodePathForBST(root.right, list, k);
		}
		if (list.get(list.size() - 1).data == k) {
			return list;
		}
		while (list.get(list.size() - 1) != root) {
			list.remove(list.size() - 1);
		}
		list.remove(list.size() - 1);
		return list;

	}
}
