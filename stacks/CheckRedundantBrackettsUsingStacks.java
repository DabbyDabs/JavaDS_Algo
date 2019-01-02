package stacks;

import java.util.Stack;

public class CheckRedundantBrackettsUsingStacks {

	public static void main(String[] args) {
		String str = "()";
		String str1 = "((a+b))";
		String str2 = "a+(a+B)";
		String str3 = "(((A+B)))";
		String str4 = "(a+(c+d))";
		String str5 = "(a+b()+c)";
		System.out.println(checkRedunBracUsinStack(str1));
	}

	public static boolean checkRedunBracUsinStack(String s) {
		Stack<Character> box = new Stack<>();
		int x = 0;
		int check = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				box.push(s.charAt(i));
				x = i;
			}
			if (s.charAt(i) == ')') {
				box.pop();
				if (x == i - 1)
					return true;
			}
			}
			x = 0;
			int y = 1;
			int q = 0, w = 0;
			for (; y < s.length();) {
				if (s.charAt(x) == '(' && s.charAt(y) == '(') {
					box.push(s.charAt(x));
					box.push(s.charAt(y));
					q = x + 2;
					w = y + 2;
					while (w < s.length()) {
						if (s.charAt(q) == '(')
							check++;
						if (s.charAt(q) == ')'&& s.charAt(w)!=')')
							check--;
						if (s.charAt(q) == ')' && s.charAt(w) == ')' && check == 0) {
							return true;
						}
						w++;
						q++;
					}
				}

				x++;
				y++;
			}
			return false;}
		
	}

