package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String>	st	=	new	HashSet<String>();
		int i	=	0;
		while(st.add("qwert"+i)	&&	i++<100);
		
		Iterator<String>	en	=	st.iterator();
		while(en.hasNext())
			System.out.println(en.next());
	}

}


/*
 * Methods are add(),
 * remove(),
 * clear,
 * contains(),
 * isEmpty,
 * size(),
 * 
 */