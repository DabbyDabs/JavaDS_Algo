package binaryTrees;

public class BinaryTreeTraversals {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
		BinaryTreeNode<Integer> node11 = new BinaryTreeNode<>(11);
		BinaryTreeNode<Integer> node12 = new BinaryTreeNode<>(12);
		BinaryTreeNode<Integer> node13 = new BinaryTreeNode<>(13);
		BinaryTreeNode<Integer> node14 = new BinaryTreeNode<>(14);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		node5.left = node6;
		node4.right = node11;
		node11.right = node12;
		node12.right = node13;
		node13.right = node14;
		printPostOrder(root);
	}

	public static void printPreorder(BinaryTreeNode<Integer> root) {
    if(root!=null) {
		System.out.print(root.data+" ");
    }
    if(root.left!=null) {
      printPreorder(root.left);
    }
    if(root.right!=null) {
    	printPreorder(root.right);
    }
	}
	public static void printInorder(BinaryTreeNode<Integer>root) {
		
	    if(root.left!=null) {
	      printInorder(root.left);
	    }
	    if(root!=null) {
			System.out.print(root.data+" ");
	    }
	    if(root.right!=null) {
	    	printInorder(root.right);
	    }
	}
	public static void printPostOrder(BinaryTreeNode<Integer>root) {
		if(root.left!=null) {
		      printPostOrder(root.left);
		    }
		 if(root.right!=null) {
		    	printPostOrder(root.right);
		    }
		 if(root!=null) {
				System.out.print(root.data+" ");
		    }
	}
}
