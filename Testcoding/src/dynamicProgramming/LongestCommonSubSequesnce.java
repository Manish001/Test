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
 * @FileName LongestCommonSubSequesnce.java
 * @Time 4:17:41 PM
 */
public class LongestCommonSubSequesnce {

	/**
	 * @param args
	 */
	static String str1;
	static String str2;
	static int arr [][];
	
	//  Recursive
	public static int getRecursiveLongestCommonSubSequesnce(int i,int j){
		if(i<0 || j<0)
			return 0;
		if(str1.charAt(i)==str2.charAt(j))
			return (1 + getRecursiveLongestCommonSubSequesnce(i-1,j-1));
		else
			return Math.max(getRecursiveLongestCommonSubSequesnce(i-1,j), getRecursiveLongestCommonSubSequesnce(i,j-1));
	}
	
	// Non - Recursive
	public static int getNonRecursiveLongestCommonSubSequesnce(int l1,int l2){
		
		for(int i =0; i<l1; i++)
			for(int j =0; j<l2; j++)
				if(str1.charAt(i)==str2.charAt(j))
						arr[i+1][j+1] = arr[i][j] + 1 ;
				else
					arr[i+1][j+1] = Math.max(arr[i][j+1], arr[i+1][j]);
		
		int result = 0;
		for(int i =0; i<=l1; i++){
			for(int j =0; j<=l2; j++){
				if(result < arr[i][j])
					result = arr[i][j];
			//	System.out.print(arr[i][j]+ " ");
			}
			//System.out.println();
	}
		return result;
		//return arr[l1][l2];
					
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1 = br.readLine();
		str2 = br.readLine();
		arr = new int[str1.length()+1][str2.length()+1]; 
		System.out.println(getRecursiveLongestCommonSubSequesnce(str1.length()-1,str2.length()-1));
		System.out.println(getNonRecursiveLongestCommonSubSequesnce(str1.length(),str2.length()));
	}

}
