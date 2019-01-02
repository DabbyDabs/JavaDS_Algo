package linkedList;

import java.util.Scanner;

public class CreateLLbyUser {

	public static void main(String[] args) {
Scanner s= new Scanner (System.in);
	Node head=new Node();
head=CreateLL(s);
	}
public static Node<Integer> CreateLL(Scanner s) {
	Node<Integer> head= new Node<>();
	System.out.println("Enter data for head:::");
     head.data=s.nextInt();
     Node<Integer> temp= new Node<>();
     temp=head;
     int m;
int x=1;
do {
	System.out.println("Enter the data if you want to add to list OR enter -1 to terminate the Linked List");
	 m = s.nextInt();
	if(m!=-1)
		{
		Node <Integer> temp1= new Node<>(m);
		temp.next=temp1;
		temp=temp1;
		x++;
		}
}while(m!=-1);
	System.out.println("Your Linked List of size "+x+" is created");
	return head;
}
}
