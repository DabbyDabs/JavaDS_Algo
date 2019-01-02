package binarySearchTree;

import binaryTrees.BinaryTreeNode;
import linkedList.Node;

public class BSTtoSortedLL {

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
		Node<Integer> ans= new Node<Integer>();
    ans=BSTtoLLhelper(node4);
    PrintLL(ans);
        
	}
	public static Node<Integer> BSTtoLLhelper(BinaryTreeNode<Integer>root){
		BSTtoLLobj obj= new BSTtoLLobj();
		obj=returnSortedLL(root, obj);
		System.out.println(obj.size);
		return obj.head;
	}
public static BSTtoLLobj returnSortedLL(BinaryTreeNode<Integer> root,BSTtoLLobj obj ){
	if(root.left==null && obj.size==0) {
		Node<Integer> head= new Node(root.data);
		obj.head=head;
		obj.curr=head;
		obj.size++;
		return obj;
	}
	if(root.left!=null) {
		obj=returnSortedLL(root.left,obj);
	}
	Node<Integer> newNode= new Node<Integer>(root.data);
	obj.curr.next=newNode;
	obj.curr=newNode;
	obj.size++;
	if(root.right!=null) {
		obj= returnSortedLL(root.right, obj);
	}
	return obj;
		}
public static void PrintLL(Node<Integer> head) {
	while(head!=null) {
		System.out.print(head.data+" ");
		head= head.next;
	}
}
}
