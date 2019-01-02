package linkedList;

import java.util.Stack;

public class CheckPalindromeUsingStack {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>();
		head.data = 2;
		Node<Integer> node1 = new Node<>(15);
		Node<Integer> node2 = new Node<>(33);
		Node<Integer> node3 = new Node<>(5);
		Node<Integer> node4 = new Node<>(2);
		// Node<Integer> node5 = new Node<>(2);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		// node4.next = node5;
		System.out.println(CheckPalindrome(head));
	}

	public static boolean CheckPalindrome(Node<Integer> head) {
		Stack<Integer> s = new Stack<>();
		Node<Integer> temp = new Node<Integer>();
		temp = head;
		int x = 0;
		while (temp != null) {
			temp = temp.next;
			x++;
		}
		temp = head;
		if (x % 2 == 0) {
			for (int i = 0; i < x; i++) {
				if (i < x / 2) {
					s.push(temp.data);
					temp = temp.next;

				}
				if (i > x / 2) {
					if (temp.data == s.pop()) {
						temp = temp.next;
						continue;
					} else
						return false;
				}

			}
		}
		if (x % 2 != 0) {
			for (int i = 0; i < x; i++) {
				if (i < x / 2) {
					s.push(temp.data);
					temp = temp.next;
					if(i==(x/2)-1)
						temp=temp.next;

				}
				if (i > x / 2) {
					if (temp.data == s.pop()) {
						temp = temp.next;
						continue;
					} else
						return false;
				}

			}

		}
		return true;
	}
}
