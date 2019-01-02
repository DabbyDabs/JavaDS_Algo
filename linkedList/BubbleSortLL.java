package linkedList;

public class BubbleSortLL {

	public static void main(String[] args) {
		Node<Integer> head = new Node<>(2);
		Node<Integer> node1 = new Node<>(33);
		Node<Integer> node2 = new Node<>(4);
		Node<Integer> node3 = new Node<>(276);
		Node<Integer> node4 = new Node<>(156);
		Node<Integer> node5 = new Node<>(88);
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		head=bubbleSortLL(head);
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}

	public static Node<Integer> bubbleSortLL(Node<Integer> head) {
		Node<Integer> temp = new Node<>();
		Node<Integer> tail = new Node<>();
		Node<Integer> temp1 = new Node<>();
		Node<Integer> temp2 = new Node<>();
		Node<Integer> Head = new Node<>();
		Node<Integer> test = new Node<>();
		temp = head;
		while (temp.next != null) {
			temp = temp.next;

		}
		tail = temp;
		temp = head;
		temp1 = head.next.next;
		temp2 = Head;
		int x = 0;
		Head=head;
		while (Head.next != tail && temp!=tail) {
			if (Head.next.next == tail) {
				Head.next = tail;
			}
			while (temp != tail) {
				
				if (x == 0 && head.data > head.next.data) {
					head.next = Head;
					head.next.next = head;
					head.next = temp1;
					temp2 = Head;
					temp1 = temp1.next;
					test=Head;
					while(test!=null) {
						System.out.print(test.data+" ");
						test=test.next;
					}
					x++;

				}
				if (x == 0 && head.data < head.next.data) {
					Head = head;
					temp = temp.next;
					temp1 = temp1.next;
					test=Head;
					while(test!=null) {
						System.out.print(test.data+" ");
						test=test.next;
					}

					x++;
					
				}
				if (temp.data > temp.next.data) {
					temp.next.next = temp;
					temp2.next = temp.next;
					temp.next = temp1;
					if (temp != tail) {
						temp = temp.next;
						if(temp1!=null)
						{temp1 = temp1.next;}
						temp2 = temp2.next;
						

						}
					test=Head;
					while(test!=null) {
						System.out.print(test.data+" ");
						test=test.next;
					}

					if (temp == tail) {
						tail = temp2;
						break;
					}

				}
if(temp.data<=temp.next.data) {
	if (temp != tail) {
		temp = temp.next;
		if(temp1!=null)
		{temp1 = temp1.next;}
		temp2 = temp2.next;
		

		}
	if (temp == tail) {
		tail = temp2;
		break;
	}
}
			}
		x=0;}
		return Head;
	}
}
