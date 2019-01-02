package linkedList;

public class LinkedListPrint {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>();
		head.data = 2;
		Node<Integer> node1 = new Node<>(5);
		Node<Integer> node2 = new Node<>(33);
		Node<Integer> node3 = new Node<>(76);
		Node<Integer> node4 = new Node<>(56);
		Node<Integer> node5 = new Node<>(88);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		PrintLL(head);
		System.out.println();
		PrintLLRecursively(head);
		System.out.println();
		PrintLLReverse(head);
	}

	public static void PrintLL(Node<Integer> head) {
		Node<Integer> temp = new Node<>();
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
	}

	public static void PrintLLRecursively(Node<Integer> head) {
		if (head == null)
			return;
		System.out.print(head.data + " ");
		head = head.next;
		PrintLLRecursively(head);
	}

	public static void PrintLLReverse(Node<Integer> head) {
		if (head == null)
			return;
		PrintLLReverse(head.next);
		if (head != null)
			System.out.print(head.data + " ");
	}
}
