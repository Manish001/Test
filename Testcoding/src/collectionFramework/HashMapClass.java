package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer,String>	m	=	new	HashMap<Integer,String>();
		Integer	i	=	0;
		while(i++	<	10)
			m.put(i,"a"+i.toString());
		Set	hs	=	 m.keySet();
		Iterator<Integer> itr	=	hs.iterator();
		while (itr.hasNext()) {
			Integer	it	=	itr.next();
			System.out.println(m.get(it));
		}
		Collection<String>	st	=	m.values();
		Iterator	itq	=	st.iterator();
		while(itq.hasNext())
			System.out.println(itq.next());
	}

}
