package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class KthSmallestBSTNode {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(40);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(50);
		//BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(60);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(100);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(110);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(120);
		BinaryTreeNode<Integer> node7 = new BinaryTreeNode<>(130);
		BinaryTreeNode<Integer> node8 = new BinaryTreeNode<>(140);
		node4.left = node2;
		node2.left = node1;
		//node2.right = node3;
		node4.right = node6;
		node6.left = node5;
		node6.right = node7;
		node7.right = node8;
		helperFun(node4,3);
	}

	public static void helperFun(BinaryTreeNode<Integer> head, int k) {
		TwoIntObj obj = new TwoIntObj();
		obj.var1 = k;
		obj.var2 = 0;
		obj = printsKthSmallestElement(head, obj);

	}

	public static TwoIntObj printsKthSmallestElement(BinaryTreeNode<Integer> head, TwoIntObj obj) {
		if (head.left == null && head.right == null && obj.var2 == 0) {
			obj.var2 = 1;
			obj.var1--;
			if(obj.var1==0) {
				System.out.println(head.data);
			}
			return obj;
		}
		if (obj.var2 == 1 && head.left != null) {// this condition is cleverly written obove the similar other condition
													// so that
													// recursion can execute smoothly without repitition
			obj = printsKthSmallestElement(head.left, obj);
		}
		if (obj.var2 == 0 && head.left != null) {
			obj = printsKthSmallestElement(head.left, obj);
		}
		
		obj.var1--;
		if (obj.var1 == 0)
			System.out.println(head.data);
		if (head.right != null) {
			obj = printsKthSmallestElement(head.right, obj);
		}
		return obj;
	}

	public static int returnsKthSmallestElement(BinaryTreeNode<Integer> head, int k, int count) {
		// function needs repairing and more precision,errors ahead!
		if (head.left == null && head.right == null && count == 0) {
			if (k == 1) {
				System.out.println(head.data);
				return count;
			}
			count++;
			return count;
		}
		if (head.left != null && count == 0) {
			count = returnsKthSmallestElement(head.left, k, count);
		}
		k--;
		if (head.left != null && count == 1) {
			count = returnsKthSmallestElement(head.left, k, count);
		}
		if (k == 1 && count == 1)
			System.out.println(head.data);
		if (head.right != null) {
			count = returnsKthSmallestElement(head.right, k, count);
		}
		return count;
	}
}
