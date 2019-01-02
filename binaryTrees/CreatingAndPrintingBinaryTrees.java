package binaryTrees;

import java.util.Scanner;

public class CreatingAndPrintingBinaryTrees {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter data of root node::");
		BinaryTreeNode<Integer> root = new BinaryTreeNode(s.next());
		takesInput(s, root);
		printBinaryTree(root);
	}

	public static void takesInput(Scanner s, BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println("Enter value for left child for "+root.data);
		int leftData = s.nextInt();
		if (leftData == -1) {
			root.left = null;
		}else {
		BinaryTreeNode<Integer> currLeft = new BinaryTreeNode<>(leftData);
		root.left=currLeft;}
		System.out.println("Enter value for right child for "+root.data);
		int rightData = s.nextInt();
		if (rightData == -1) {
			root.right = null;
		}
		else {
		BinaryTreeNode<Integer> currRight = new BinaryTreeNode<>(rightData);
		root.right=currRight;
		}
		if (root.left != null) {
			takesInput(s,root.left);
		}
		if (root.right != null) {
			takesInput(s, root.right);
		}

	}
public static void printBinaryTree(BinaryTreeNode root) {
	if(root!=null) {
	System.out.print(root.data+": ");
	}
	if(root.left!=null) {
		System.out.print("L"+root.left.data+" ");
	}
	if(root.right!=null) {
		System.out.print("R"+root.right.data);
	}
	System.out.println();
	if(root.left!=null) {
		printBinaryTree(root.left);
	}
	if(root.right!=null) {
		printBinaryTree(root.right);
	}
}
}
