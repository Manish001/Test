package Testing;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class GFG {

	public static void main(String[] args) {
		
		String	str	=	new	String("there");
		String	str1	=	new	String("there");
		System.out.println(str.compareTo(str1)+" "+str.length()+" "+str.charAt(2));
		List<String>	it	=	new ArrayList<String>();
		it.add("qw");
		it.add("qe");
		it.add("qr");
		it.add("qt");
		it.add("qy");
		ListIterator<String>	iter	=	it.listIterator();	
		while(iter.hasNext()){
			String	st	=iter.next();
			if(!st.equals("qe"))
				System.out.println(st);
			if(st.equals("qe")){
				System.out.println(st);
				iter.remove();
			}
		}
while(iter.hasPrevious())
				System.out.println(iter.previous());
	}

}
