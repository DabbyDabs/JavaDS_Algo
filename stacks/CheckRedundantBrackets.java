package stacks;

public class CheckRedundantBrackets {

	public static void main(String[] args) {
		String str = "()";
		String str1 = "((a+b))";
		String str2 = "a+(a+B)";
		String str3 = "(((A+B)))";
		String str4 = "(a+(c+d))";
		String str5 = "(a+b()+c)";
		System.out.println(checkRedundantBrackets(str4));

	}

	public static boolean checkRedundantBrackets(String s) {
		char[] display = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				display[i] = '*';
				continue;
			}
			if (s.charAt(i) == ')') {
				display[i] = '@';
				continue;
			}
			display[i] = 'a';
		} // for loop ends
		int x = 0, y = 1;
		for (; y < display.length;)// checking for empty brackets
		{
			if (display[x] == '*' && display[y] == '@')
				return true;
			x++;
			y++;
		}
		x = 0;
		y = 1;
		int z = 2, w = 3;
		for (; y < s.length();) {
			if (display[x] == '*' && display[y] == '*') {
				z = x + 2;
				w = y + 2;
				for (; w < s.length();) {
					if (display[z] == '@' && display[w] == '@') {
						int check = 0;
						for (int i = y + 1; i < z; i++) {
							if (display[i] == '*')
								check++;
							if (display[i] == '@')
								check--;
						}
						if (check == 0)
							return true;

					}
					w++;
					z++;
				}

			}
x++;
y++;
		}
return false;
	}

}
