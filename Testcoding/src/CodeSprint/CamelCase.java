/**
 @author chauhan.manish
 * @Date   23-Jul-2016
 * @Package Name CodeSprint
 * @Project Testcoding
 */
package CodeSprint;

import java.util.Scanner;

/**
 *@author chauhan.manish
 * @FileName CamelCase.java
 * @Time 10:53:02 PM
 */
public class CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char arr [] = s.toCharArray();
        int count = 1;
        for(int i = 0 ; i < arr.length; i++)
        	if(Character.isUpperCase(arr[i]))
        		count++;
        		
        System.out.println(count);
	}
}
