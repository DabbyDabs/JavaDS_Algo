package binaryTrees;

import java.util.Scanner;

import queues.QueueUsingLL;

public class CreateBinaryTreeLevelWise {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of root node");
		int rootValue = s.nextInt();
		QueueUsingLL<BinaryTreeNode> q = new QueueUsingLL<>();
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootValue);
		q.enqueue(root);
		CreateAndReturnBinaryTreeLevelWise(root, q, s);
		printBinaryTree(root);

	}

	public static void CreateAndReturnBinaryTreeLevelWise(BinaryTreeNode<Integer> root, QueueUsingLL<BinaryTreeNode> q,
			Scanner s) throws Exception {
		
		System.out.println("Enter the left child of node " + root.data);
		int leftValue = s.nextInt();
		if (leftValue == -1) {
			root.left = null;
		} else {
			BinaryTreeNode<Integer> nodeLeft = new BinaryTreeNode<>(leftValue);
			root.left = nodeLeft;
			q.enqueue(nodeLeft);
		}
		System.out.println("Enter the right child of node " + root.data);
		int rightValue = s.nextInt();
		if (rightValue == -1) {
			root.right = null;
		} else {
			BinaryTreeNode<Integer> nodeRight = new BinaryTreeNode<>(rightValue);
			root.right = nodeRight;
			q.enqueue(nodeRight);
		}
		q.dequeue();
       if (q.getSize() == 0) {
			return;
		}
				CreateAndReturnBinaryTreeLevelWise(q.peek(), q, s);
	}

	public static void printBinaryTree(BinaryTreeNode root) {
		if (root != null) {
			System.out.print(root.data + ": ");
		}
		if (root.left != null) {
			System.out.print("L" + root.left.data + " ");
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		if (root.left != null) {
			printBinaryTree(root.left);
		}
		if (root.right != null) {
			printBinaryTree(root.right);
		}
	}
	
}
