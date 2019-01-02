package stacks;

import java.util.Stack;

public class BalancedParenthesisCheck {

	public static void main(String[] args) throws Exception {
String str="((x+y{ }-[ ]))";
System.out.println(CheckParenthesis(str));
	}
public static boolean CheckParenthesis (String str) throws Exception {
	StackUsingLL<Character> s= new StackUsingLL<>();
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{') 
		{s.push(str.charAt(i));
			System.out.println(str.charAt(i));
		}
		if(str.charAt(i)==')'||str.charAt(i)==']'||str.charAt(i)=='}')
		{if(s.getSize()==0){
			return false;
		}
		
		{char check =s.pop();
		System.out.println(check);
		if(check=='('&& str.charAt(i)==')')
			continue;
		if(check=='['&& str.charAt(i)==']')
			continue;
		if(check=='{'&& str.charAt(i)=='}')
			continue;
		return false;
		}
		}
	}
	return (s.getSize()==0);
	
}
}
