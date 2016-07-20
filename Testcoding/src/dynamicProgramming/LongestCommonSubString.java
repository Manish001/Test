/**
 @author chauhan.manish
 * @Date   20-Jul-2016
 * @Package Name dynamicProgramming
 * @Project Testcoding
 */
package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@author chauhan.manish
 * @FileName LongestCommonSubString.java
 * @Time 2:48:48 PM
 */
public class LongestCommonSubString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	static int arr [][];
	static String str;
	static String str1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		str1 = br.readLine();
		arr  = new int [str.length()+1][str1.length()+1];

		System.out.println(getLongestCommonSubString(str.length(),str1.length()));
	}

	public static int  getLongestCommonSubString(int i1 ,int j1){
		for(int i = 0 ; i < i1; i++)
			for(int j = 0 ; j < j1; j++)
				if(str.charAt(i)==str1.charAt(j))
					arr[i+1][j+1] = (1 + arr[i][j]);
				else
					arr[i+1][j+1]= 0;

		int result=0;
		for(int i = 1 ; i <= i1; i++)
			for(int j = 1 ; j <= j1; j++)
				if(result < arr[i][j])
						result = arr[i][j];
		return result;

	}
}
