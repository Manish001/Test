/**
 @author chauhan.manish
 * @Date   18-Jul-2016
 * @Package Name dynamicProgramming
 * @Project Testcoding
 */
package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@author chauhan.manish
 * @FileName CountDerangements.java
 * @Time 11:17:32 AM
 */
public class CountDerangements {

	static int arr[];
	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		arr = new int [Integer.parseInt(br.readLine())+1];
		System.out.println(calculate(arr.length -1));
	}

	protected static int calculate(int n){
		
		for(int i =0; i<=n ; i++)
		{
			if(i == 0 || i == 2)
				arr[i] = 1;
			else if (i == 1)
				arr[i] = 0;
			else
				arr[i]= (i-1)*(arr[i-1] + arr[i-2]);
		}
		
		return arr[n];
	}
}
