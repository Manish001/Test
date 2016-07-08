package collectionFramework;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer>	st	=	new	Stack<Integer>();
		int i	=	1;
		while(i<10)
			st.push(i++);
		System.out.println(st.search(2)+" "+st.search(11));
		System.out.println(st.peek());
		while(!st.isEmpty())
		{
			Integer	i1	=	st.pop();
			System.out.println(i1);
		}
		
	}

}
/*push()
 * pop
 * peek
 * isEnmpty
 * search();
*/