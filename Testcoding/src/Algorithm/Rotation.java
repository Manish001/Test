/**
 @author chauhan.manish
 * @Date   07-Sep-2016
 * @Package Name Algorithm
 * @Project Testcoding
 */
package Algorithm;

import java.util.Arrays;

/**
 *@author chauhan.manish
 * @FileName Rotation.java
 * @Time 7:32:20 PM
 */
public class Rotation {

		/**
		* @param args
		*/
		private static String getRotation(String str)
		{
		   int n = str.length();

		   String arr[] = new String [n];

		   String concat = str;
		   String concat2 = str;
		   for (int i = 0; i < n; i++)
		       arr[i] = concat.substring(i) + concat2.substring(0, i);

		   Arrays.sort(arr);
		   return arr[0];
		}
	
	
	
	public static void main(String[] args) {
		String str = "rotate";
		String it = "and";
		String  str1 = getRotation(str) ;
		System.out.println(str1);
	}

}
