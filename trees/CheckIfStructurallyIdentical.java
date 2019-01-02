package trees;

public class CheckIfStructurallyIdentical {

	public static void main(String[] args) {
		TreeNode<Integer> root1 = new TreeNode<>(2);
		TreeNode<Integer> node1 = new TreeNode<>(1);
		TreeNode<Integer> node2 = new TreeNode<>(3);
		TreeNode<Integer> node3 = new TreeNode<>(8);
		TreeNode<Integer> leaf1 = new TreeNode<>(10);
		TreeNode<Integer> leaf2 = new TreeNode<>(20);
		TreeNode<Integer> leaf3 = new TreeNode<>(5);
		TreeNode<Integer> leaf4 = new TreeNode<>(11);
		root1.children.add(node1);
		root1.children.add(node2);
		root1.children.add(node3);
		node1.children.add(leaf1);
		node1.children.add(leaf2);
		node2.children.add(leaf3);
		node3.children.add(leaf4);
		TreeNode<Integer> root2 = new TreeNode<>(2);
		TreeNode<Integer> node11 = new TreeNode<>(1);
		TreeNode<Integer> node21 = new TreeNode<>(3);
		TreeNode<Integer> node31 = new TreeNode<>(8);
		TreeNode<Integer> leaf11 = new TreeNode<>(10);
		TreeNode<Integer> leaf21 = new TreeNode<>(20);
		TreeNode<Integer> leaf31 = new TreeNode<>(5);
		TreeNode<Integer> leaf41 = new TreeNode<>(11);
		root2.children.add(node11);
		root2.children.add(node21);
		root2.children.add(node31);
		node11.children.add(leaf11);
		node11.children.add(leaf21);
		node21.children.add(leaf31);
		node31.children.add(leaf41);
		System.out.println(CheckIfTreesAreIdentical(root1, root2));
	}

	public static boolean CheckIfTreesAreIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if (root1.data != root2.data || root1.children.size() != root2.children.size()) {
			return false;
		}
		for (int i = 0; i < root1.children.size(); i++) {
			boolean m = CheckIfTreesAreIdentical(root1.children.get(i), root2.children.get(i));
			if (m == false) {
				return false;
			}
		}
		return true;
	}

}
