package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		LinkedHashSet<String> st	=	new	LinkedHashSet<String>();
		st.add("Hello");
		st.add("There");
		for (String string : st)
		System.out.println(string);
	}

}
/*SubClass of HashSet
*/