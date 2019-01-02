package binarySearchTree;

import binaryTrees.BinaryTreeNode;

public class SortedArrToBST {

	public static void main(String[] args) {
int []arr= {2,5,7,9,21,34,54,67,75,82,97,99,100};
BinaryTreeNode<Integer> finalHead= helperfunBST(arr);
printShowingChildrenOfBinaryTree(finalHead);
	}
	public static BinaryTreeNode<Integer>helperfunBST(int[] arr) {
		return ArrToBST(arr,0,arr.length-1);
	}
	
public static BinaryTreeNode<Integer> ArrToBST(int [] arr,int startIndex,int endIndex){
	if(startIndex>endIndex) {
		return null;
	}
int mid= (startIndex+endIndex)/2;
BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(arr[mid]);
root.left=ArrToBST(arr, startIndex,mid-1);
root.right= ArrToBST(arr,mid+1, endIndex);
return root;
}
public static void printLevelWiseBinaryTree(BinaryTreeNode<Integer> root) {
	int height = returnHeightOfBinaryTree(root, 0);
	int i = 1;
	while (i <= height) {
		printAllRootsAtDepthK(root, i);
		System.out.println();
		i++;
	}

}

public static int returnHeightOfBinaryTree(BinaryTreeNode<Integer> root, int height) {
	height++;
	int x = 0;
	int y = 0;
	if (root.left != null) {
		x = returnHeightOfBinaryTree(root.left, 0);
	}
	if (root.right != null) {
		y = returnHeightOfBinaryTree(root.right, 0);
	}
	return Math.max(x, y) + height;
}

public static void printAllRootsAtDepthK(BinaryTreeNode<Integer> root, int k) {
	if (k == 1) {
		System.out.print(root.data + " ");
	}
	k--;
	if (root.left != null) {
		printAllRootsAtDepthK(root.left, k);
	}
	if (root.right != null) {
		printAllRootsAtDepthK(root.right, k);
	}
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
