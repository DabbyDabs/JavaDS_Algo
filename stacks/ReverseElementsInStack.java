package stacks;

import java.util.Stack;

public class ReverseElementsInStack {

	public static void main(String[] args) {
Stack<Integer> s1= new Stack();
Stack<Integer> s2= new Stack();
for(int i=1;i<=5;i++)
	s1.push(i);
reverseElementsInStack(s1,s2);
	}
public static void reverseElementsInStack(Stack<Integer>s1,Stack<Integer>s2) {
	int container=0;
int size=s1.size();
	int i=s1.size();
	int m=size;
while(m!=0) {
		for(int p=1;p<size;p++) {
			s2.push(s1.pop());
			}
		container=s1.pop();
		for(int p=1;p<=size;p++) {
			if(p==i) {
				s1.push(container);
				continue;
			}
			else {
				s1.push(s2.pop());
			}
			
		}
		i--;
	m--;	
	}
	
	
	
	
	
	
	
	System.out.print("top ");
	while(!s1.isEmpty()) {
		System.out.print(s1.pop()+" ");
	
		
	}
	
}
}
