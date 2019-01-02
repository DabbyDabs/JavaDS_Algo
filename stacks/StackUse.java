package stacks;

public class StackUse {

	public static void main(String[] args) throws Exception {
		StackUsingLL<Integer> s = new StackUsingLL<>();
		s.push(5);
		s.push(3);
		for (int i = 0; i < 34; i++) {
			s.push(i);

		}
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println(s.peek());
		s.PrintStack();
	}
}
