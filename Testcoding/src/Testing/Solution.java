package Testing;

import java.util.Stack;

public class Solution {

	static String[] braces(String[] values) {
		String[] str = new String[values.length];
		for(int i=0;i<values.length;i++){
			str[i]=checkBraces(values[i]);
		}
		return str;
	}

	public static String checkBraces(String value){

		Stack<Character>  charStack	=	new Stack();
		for(int i=0;i<value.length();i++){
			char c	= value.charAt(i);
			if(c=='{' ||  c=='[' || c=='(')
				charStack.push(value.charAt(i));
			else if(!charStack.isEmpty())
				{
				if(c=='}'&& charStack.peek().equals('{') ||  c==']' && 
						charStack.peek().equals('[') || c==')' &&   
						charStack.peek().equals('('))
					
					charStack.pop();
				}
			else
				return "NO";
		}

		if(charStack.isEmpty())
			return "YES";
		else
			return "NO";

	}


	public static void main(String[] args) {
		String [] str	={"()","{}{"};
		String [] str1=braces(str);
		System.out.println(str1[1]);
	}

}
