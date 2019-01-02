package binaryTrees;

public class MirrorImageOfBinaryTree {

	public static void main(String[] args) {
		BinaryTreeNode<Integer>root= new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer>node1= new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer>node2= new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer>node3= new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer>node4= new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer>node5= new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer>node6= new BinaryTreeNode<>(7);
		root.left=node1;
		root.right=node2;
		node1.left=node3;
		node1.right=node4;
		node2.right=node5;
		node5.left=node6;
		BinaryTreeNode<Integer>head= new BinaryTreeNode<>(1);
		printBinaryTree(root);
		System.out.println();
		CreateMirrorTree(root, head);
		printBinaryTree(head);
	}
public static BinaryTreeNode<Integer> CreateMirrorTree(BinaryTreeNode<Integer>root,BinaryTreeNode<Integer>head) {
   head.data=root.data;
	if(root.left!=null) {
		BinaryTreeNode<Integer>currRight= new BinaryTreeNode<>(1);
		head.right=currRight;
		CreateMirrorTree(root.left, head.right);
	}
	if(root.right!=null) {
		BinaryTreeNode<Integer>currLeft= new BinaryTreeNode<>(1);
		head.left=currLeft;
		CreateMirrorTree(root.right, head.left);
	}
	return head;
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
