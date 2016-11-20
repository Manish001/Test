/**
 @author chauhan.manish
 * @Date   24-Jul-2016
 * @Package Name CodeSprint
 * @Project Testcoding
 */
package CodeSprint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *@author chauhan.manish
 * @FileName BuildPalindrome.java
 * @Time 12:01:01 AM
 */
public class BuildPalindrome {

	/**
	 * @param args
	 */
	static Set<String> string1;
	static Set<String> string2;
	public static Set<String> getSetString(String s){
		int L = s.length();
		Set<String> hs = new HashSet<String>();
		for (int i = 0; i < L; ++i) {
			for (int j = 0; j < (L - i); ++j) {
				hs.add(s.substring(j, i + j + 1));
			}
		}
		return hs;
	}

	public static boolean isPaliondrom(String str)
	{
		int lower = 0;
		int higher = str.length() - 1;

		while (higher > lower)
		{
			if (str.charAt(lower)!= str.charAt(higher))
			{
				return false;
			}
			lower++;
			higher--;
		}

		return true;

	}

	public static String getString(Set<String> st1,Set<String> st2){
		Iterator<String> itr1 = st1.iterator();
		String string=null,string1 = "-1";
		int size=0,size1=0;
		int L = st1.size();
		int L2 = st2.size();

		while (itr1.hasNext()) {
			String str1 = itr1.next();
			Iterator<String> itr2 = st2.iterator();
			
			while (itr2.hasNext()) {
				String str2 = itr2.next();
				string = str1+str2;
				if(isPaliondrom(string)){
					size = string.length();
					if(size > size1){
						string1 = string;
						size1 = string.length();
					}
				}
			}
		}
		return string1;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for(int a0 = 0; a0 < n; a0++){
			String s = br.readLine();
			String s1 = br.readLine();
			string1 = getSetString(s);
			string2 = getSetString(s1);
			String str1 = getString(string1,string2);
				System.out.println(str1);

		}

	}

}
