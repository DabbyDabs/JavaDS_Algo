package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class BSTTestClass {//Delete function yet to be made!!!

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
deleteNode(7,node4);
printShowingChildrenOfBinaryTree(node4);
	}
	
private static BinaryTreeNode<Integer> deleteNode(int data,BinaryTreeNode<Integer>root){
	if(root==null) {
		BinaryTreeNode<Integer> flag= new BinaryTreeNode<Integer>(Integer.MIN_VALUE);
		return null;
	}
	if(root.data==data) {
	if(root.right==null && root.left== null) {
		root=null;
		return root;
	}
		if(root.right==null) {
			root=root.left;
		    return root;
		}
		if(root.left==null) {
			root=root.right;
		   return root;
		}
		
    if(root.right!=null && root.left!=null) {
    	int temp= deleteLeafNodeAndReturnData(root.right,"minRight");
    	root.data=temp;
    	return root;
    }
		}
		if(root.data>data) {
          deleteNode(data, root.left);
		}
		if(root.data<data) {
			deleteNode(data,root.right);
		}
	
	 return null;
}
public static int deleteLeafNodeAndReturnData(BinaryTreeNode<Integer> root,String extreme) {
	int temp=0;
	if(extreme=="maxLeft") {
		if(root.right==null) {
			temp=root.data;
			root=null;
			return temp;
		}
		deleteLeafNodeAndReturnData(root.right, extreme);
	}
	if(extreme=="minRight") {
		if(root.left==null) {
			temp=root.data;
			root=null;
			return temp;
		}
		deleteLeafNodeAndReturnData(root.left, extreme);
	}
	return 0;
}
public static void printShowingChildrenOfBinaryTree(BinaryTreeNode<Integer>root) {
	System.out.print(root.data+" :");
	if(root.left!=null) {
		System.out.print(root.left.data+" ");
	}
	if(root.left==null) {
		System.out.print(" noLeftChild ");
	}
	if(root.right!=null) {
		System.out.print(root.right.data);
		}
	if(root.right==null) {
		System.out.print(" noRightChild ");
	}
	System.out.println();
	if(root.left!=null) {
		printShowingChildrenOfBinaryTree(root.left);
	}
	if(root.right!=null) {
		printShowingChildrenOfBinaryTree(root.right);			
	}
}
}
