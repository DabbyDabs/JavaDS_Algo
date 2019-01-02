package trees;

import queues.QueueUsingArray;
import java.util.Scanner;

public class CreateTreesLevelWise {

	public static void main(String[] args) throws Exception {
		QueueUsingArray<TreeNode> q = new QueueUsingArray<>(10);
		System.out.println("Enter the data required for root node::");
		Scanner s = new Scanner(System.in);
		int firstData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<>(firstData);
		q.Enqueue(root);
		while (!q.isEmpty()) {
			q = makeChildrens(q.peek(), s, q);
			System.out.println("this was removed from queue::" + q.Dequeue().data);
		}

	}

	public static QueueUsingArray<TreeNode> makeChildrens(TreeNode curr, Scanner s, QueueUsingArray<TreeNode> q)
			throws Exception {
		System.out.println("How many children you wish to make for " + curr.data + "::");
		int l = s.nextInt();
		for (int i = 1; i <= l; i++) {
			System.out.println("Enter the data for " + i + "child::");
			TreeNode<Integer> currChild = new TreeNode<>(s.nextInt());
			q.Enqueue(currChild);

		}
		return q;
	}

}
// TreeNode<Integer> child1 = new TreeNode<>(5);
// TreeNode<Integer> child2= new TreeNode<>(6);
// root.children.add(child1);
// root.children.add(child2);
// System.out.println(root.children.get(1).data);
// for(int i=0;i<12;i++) {
// q.Enqueue(i);
// System.out.println(q.getSize());
// }