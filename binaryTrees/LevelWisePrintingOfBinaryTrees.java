package binaryTrees;

public class LevelWisePrintingOfBinaryTrees {

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
printLevelWiseBinaryTree(root);
	}
public static void printLevelWiseBinaryTree(BinaryTreeNode<Integer> root) {
	int height=returnHeightOfBinaryTree(root,0);
	int i=1;
	while(i<=height) {
printAllRootsAtDepthK(root,i);	
System.out.println();
i++;
	}
	
	
}
public static int returnHeightOfBinaryTree(BinaryTreeNode<Integer> root,int height) {
	height++;
	int x=0;
	int y=0;
	if(root.left!=null) {
	 x = returnHeightOfBinaryTree(root.left,0);
	}
	if(root.right!=null) {
	 y= returnHeightOfBinaryTree(root.right,0);
	}
	return Math.max(x,y)+height;
}
public static void printAllRootsAtDepthK(BinaryTreeNode<Integer> root,int k) {
if(k==1) {
	System.out.print(root.data+" ");
}
	k--;
	if(root.left!=null) {
		printAllRootsAtDepthK(root.left, k);
	}
	if(root.right!=null) {
		printAllRootsAtDepthK(root.right, k);
	}
}
}
