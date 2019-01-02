package binaryTrees;

import linkedList.Node;
//this code needs to be checked and repaired!
public class ArrayOfLLContainingLevels {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
		BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(4);
		BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>(5);
		BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>(6);
		BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>(7);
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.right = node5;
		node5.left = node6;
		sendsArrayOfLLatEachLevel(root);
	}

	public static BinaryTreeNode<Integer>[] sendsArrayOfLLatEachLevel(BinaryTreeNode<Integer> root) {
//		int height = returnHeightOfBinaryTree(root, 0);
//		BinaryTreeNode<Integer>[] levels = new BinaryTreeNode[height];
		Node<Integer>NODE= new Node(1);
		Node<Integer>finalHead= new Node();
		finalHead=returnsLLforLevelOfTreeAtDepthK(root,3, NODE);
		//printLinkedList(finalHead);
   return null;
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
	public static Node<Integer> returnsLLforLevelOfTreeAtDepthK( BinaryTreeNode<Integer> root, int k, Node current) {
		if (k == 1) {
      Node<Integer> nyanode= new Node(root.data);
      current.next=nyanode;
      current=current.next;
		}
		k--;
		if(root.left!=null) {
			returnsLLforLevelOfTreeAtDepthK(root.left, k,current);
		}
		if(root.right!=null) {
			returnsLLforLevelOfTreeAtDepthK(root.right, k,current);
		}
		System.out.print(current.data+" ");
		return current;
	}
	public static void printLinkedList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}
