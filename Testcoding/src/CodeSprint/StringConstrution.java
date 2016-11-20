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
 * @FileName StringConstrution.java
 * @Time 11:28:39 PM
 */
public class StringConstrution {

	/**
	 * @param args
	 */
	public static int getMinCost(String str){
		int cost = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i< str.length(); i++){
			String s = String.valueOf(str.charAt(i));
			if(!sb.toString().contains(s)){
				sb.append(s);
				cost++;
			}
		
		}
		
		return cost;
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            System.out.println(getMinCost(s));
        }

	}

}
