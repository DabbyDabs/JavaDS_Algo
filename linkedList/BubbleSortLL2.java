package linkedList;

public class BubbleSortLL2 {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>(1);
		Node<Integer> node1 = new Node<>(2);
		Node<Integer> node2 = new Node<>(3);
		Node<Integer> node3 = new Node<>(4);
		Node<Integer> node4 = new Node<>(6);
		Node<Integer> node5 = new Node<>(5);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		head = bubbleSortLLNew(head);
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static Node<Integer> bubbleSortLLNew(Node<Integer> head) {
		Node<Integer> t = new Node();
		Node<Integer> v = new Node();
		Node<Integer> f = new Node();
		Node<Integer> Head = new Node();
		Node<Integer> tail = new Node();
		Node<Integer> temp = new Node();
		Node<Integer> prev = new Node();
		int size = 1;
		t = head;
		while (t.next != null) {
			t = t.next;
			size++;

		}
		tail = t;
		if (size == 2) {
			t = head;
			v = head.next;
			if (t.data > v.data) {
				v.next = t;
				t.next = null;
				return v;
			}
			return t;
		}
		Head = head;
		prev = head;
		int count = size;
		int update = 0;
		while (count > 0) {
			t = Head;
			v = Head.next;
			f = v.next;
			while (t != tail) {
				if (t != null && v != null && t.data > v.data) {
					t.next = f;
					v.next = t;

					if (update != 0) {
						prev.next = v;
						prev = prev.next;
					}
					if (update == 0) {
						Head = v;
					}
					if(update==size-1) {
						t.next=null;
					}

					if (f != null)
						f = f.next;
					if (t == tail) {
						tail = v;
						break;
					}
					if (t.next != null)
						v = t.next;
					update++;
					temp = Head;
					while (temp != null) {
						System.out.print(temp.data + " ");
						temp = temp.next;
					}
					System.out.println();
					continue;
				}
				if (update != 0) {
					if (prev != null)
						prev = prev.next;
				}
				if (t != null)
					t = t.next;
				if (v != null)
					v = v.next;
				if (f != null)
					f = f.next;
				if(update==size-1) {
					t.next=null;}
				temp = Head;
				while (temp != null) {
					System.out.print(temp.data + " ");
					temp = temp.next;
				}
				System.out.println();
				update++;
			}
			update = 0;
			count--;
		}
		return Head;
	}
}
