package binaryTrees;

import linkedList.Node;

public class SortedLLtoBST {

	public static void main(String[] args) {
Node<Integer> head = new Node<Integer>(1);
Node<Integer> node2= new Node<Integer>(2);
Node<Integer> node3= new Node<Integer>(3);
Node<Integer> node4= new Node<Integer>(4);
Node<Integer> node5= new Node<Integer>(5);
Node<Integer> node6= new Node<Integer>(6);
Node<Integer> node7= new Node<Integer>(7);
Node<Integer> node8= new Node<Integer>(8);
Node<Integer> node9= new Node<Integer>(9);
Node<Integer> node10= new Node<Integer>(10);
head.next=node2;
node2.next= node3;
node3.next= node4;
node4.next= node5;
node5.next= node6;
node6.next= node7;
node7.next= node8;
node8.next= node9;
node9.next=node10;
Node<Integer> end = new Node<Integer>();
end = node10;
BinaryTreeNode<Integer>ans=makeBSTfromLL(head, end,10);
printShowingChildrenOfBinaryTree(ans);

	}
public static BinaryTreeNode<Integer> makeBSTfromLL(Node<Integer>start,Node<Integer>end,int size){
	if(size==1) {
BinaryTreeNode<Integer> alone= new BinaryTreeNode<Integer>(start.data);
return alone;
	}
	if(size==2) {
		BinaryTreeNode<Integer> node1= new BinaryTreeNode<Integer>(start.data);
		BinaryTreeNode<Integer> node2= new BinaryTreeNode<Integer>(start.next.data);
		node1.right= node2;
		return node1;
	}
	int mid= (size+1)/2;
 Node<Integer> temp= new Node<Integer>();
 temp=start;
 for(int i=1;i<mid-1;i++) {
	 temp=temp.next;
 }
 Node<Integer> middle= new Node<Integer>();
 middle=temp.next;
 BinaryTreeNode<Integer> curr= new BinaryTreeNode<Integer>(temp.next.data);
 if(mid-1>0) {
 curr.left=makeBSTfromLL(start,temp,mid-1);
 }
 if(size-mid>0 && middle!=null) {
  curr.right= makeBSTfromLL(middle.next,end,size-mid);}
  return curr;
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
