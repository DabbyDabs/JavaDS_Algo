package trees;

public class CountLeafNodes {

	public static void main(String[] args) {
		TreeNode<Integer> root = new TreeNode<>(2);
		TreeNode<Integer> node1 = new TreeNode<>(1);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(8);
		TreeNode<Integer> leaf1 = new TreeNode<>(10);
		TreeNode<Integer> leaf2 = new TreeNode<>(20);
		TreeNode<Integer> leaf3 = new TreeNode<>(5);
		TreeNode<Integer> leaf4 = new TreeNode<>(11);
		TreeNode<Integer> leaf5 = new TreeNode<>(546);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node1.children.add(leaf1);
		node1.children.add(leaf2);
		node2.children.add(leaf3);
		node3.children.add(leaf4);
		leaf4.children.add(leaf5);
		System.out.println(givesNumberOfLeafNodes(root, 0));
	}
public static int givesNumberOfLeafNodes(TreeNode<Integer> root,int leafNodes) {
if(root.children.size()==0) {
	return 1;
}

for(int i=0;i<root.children.size();i++) {
	int x= givesNumberOfLeafNodes(root.children.get(i),0);
	leafNodes+=x;
}
return leafNodes;
}
}
