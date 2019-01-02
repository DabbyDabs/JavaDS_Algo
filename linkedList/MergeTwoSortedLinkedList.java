package linkedList;

public class MergeTwoSortedLinkedList {

	public static void main(String[] args) {
		Node<Integer> head1 = new Node<>();
		head1.data = 2;
		Node<Integer> node1 = new Node<>(5);
		Node<Integer> node2 = new Node<>(33);
		Node<Integer> node3 = new Node<>(76);
		Node<Integer> node4 = new Node<>(86);
		Node<Integer> node5 = new Node<>(88);
		head1.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		Node<Integer> head2 = new Node<>();
		head2.data = 3;
		Node<Integer> node11 = new Node<>(15);
		Node<Integer> node12 = new Node<>(30);
		Node<Integer> node13 = new Node<>(61);
		Node<Integer> node14 = new Node<>(343);
		//Node<Integer> node15 = new Node<>(18);
		head2.next = node11;
		node11.next = node12;
		node12.next = node13;
		node13.next = node14;
		//node14.next = node15;
		Node<Integer> ans = new Node<>();
		ans = MergeTwoSortedLL(head1, head2);
		while (ans != null) {
			System.out.println(ans.data);
			ans = ans.next;
		}
	}

	public static Node<Integer> MergeTwoSortedLL(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> temp1 = new Node<>();
		Node<Integer> temp2 = new Node<>();
		Node<Integer> newHead = new Node<>();
		Node<Integer> temp3 = new Node<>();
		temp1 = head1;
		temp2 = head2;
		int x = 0;
		while (temp1 != null && temp2 != null) {
			if (temp1.data <= temp2.data) {
				if (x == 0) {
					newHead = temp1;
					temp3 = newHead;
					temp1 = temp1.next;
					x++;
					continue;
				}
				temp3.next = temp1;
				temp3 = temp1;
				temp1 = temp1.next;
				x++;
				continue;

			}
			if (temp1.data > temp2.data) {
				if (x == 0) {
					newHead = temp2;
					temp3 = newHead;
					temp2 = temp2.next;
					x++;
					continue;
					

				}
				temp3.next = temp2;
				temp3 = temp2;
				temp2 = temp2.next;

			}

			

		}
		if (temp1 == null)
			temp3.next = temp2;

		if (temp2 == null) {
			temp3.next = temp1;
		}
		return newHead;
	}
}
