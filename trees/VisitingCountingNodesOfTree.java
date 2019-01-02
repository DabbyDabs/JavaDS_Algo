package trees;

public class VisitingCountingNodesOfTree {

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<>(2);
		TreeNode<Integer> node1 = new TreeNode<>(1);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(8);
		TreeNode<Integer> leaf1 = new TreeNode<>(10);
		TreeNode<Integer> leaf2 = new TreeNode<>(20);
		TreeNode<Integer> leaf3 = new TreeNode<>(5);
		TreeNode<Integer> leaf4 = new TreeNode<>(11);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(leaf1);
		node1.children.add(leaf2);
		node2.children.add(leaf3);
		node3.children.add(leaf4);
		System.out.println(giveNodesGreaterThanN(root,0,0));
		
	}
	
	
public static int  countNumberOfNodes(TreeNode<Integer> root,int count) {
	int sum=count+1;
	for(int i=0;i<root.children.size();i++) {
		int x=countNumberOfNodes(root.children.get(i),0);
		sum+=x;
	}
	return sum;
}


public static int returnMaxInTree(TreeNode<Integer> root, int max) {
	if(root.data > max) {
		max=root.data;
	}
	for(int i=0;i<root.children.size();i++) {
		int childMax=returnMaxInTree(root.children.get(i),max);
		if(childMax>max) {
			max=childMax;
		}
		}
	return max;
}
public static int giveNodesGreaterThanN(TreeNode<Integer> head, int N,int count) {
	if(head.data > N) {
		count++;
	}
	int sum=count;
	for(int i=0;i<head.children.size();i++) {
		int x=giveNodesGreaterThanN(head.children.get(i),N,0);
		sum+=x;
	}
	return sum;
}
}
