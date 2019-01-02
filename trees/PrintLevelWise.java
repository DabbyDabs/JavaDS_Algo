package trees;
import java.util.Queue;
import queues.QueueUsingArray;

public class PrintLevelWise {

	public static void main(String[] args) throws Exception {
		QueueUsingArray<TreeNode> q = new QueueUsingArray<>(10);
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
		q.Enqueue(root);
		printTreeLevelWise(root, q, root);

	}

	public static void printTreeLevelWise(TreeNode head, QueueUsingArray<TreeNode> q, TreeNode rightmost)
			throws Exception {
    if(head==rightmost) {
    	System.out.println(head.data);
    }
    else {
    	System.out.print(head.data+" ");
    }
		
	for (int i = 0; i < head.children.size(); i++) {

			if (head == rightmost && i == head.children.size() - 1) {
				rightmost = (TreeNode) head.children.get(i);
			}
			q.Enqueue((TreeNode) head.children.get(i));

		}
		q.Dequeue();
		
		if (q.getSize() != 0) {
			printTreeLevelWise(q.peek(), q, rightmost);
		}
	}
}
