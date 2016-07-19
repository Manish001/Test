/**
 @author chauhan.manish
 * @Date   14-Jul-2016
 * @Package Name Testing
 * @Project Testcoding
 */
package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *@author chauhan.manish
 * @FileName Solution001.java
 * @Time 7:15:51 PM
 */
public class Solution001 {

		private static int Xor1(int x, int y)
		{
			   return (x | y) & (~x | ~y);
			//return (x ^ y);
			}
	
	   public static void main(String args[] ) throws Exception {
	       
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       String line = br.readLine();
	       String [] st1 = line.split(" ");
	       int N = Integer.parseInt(st1[0]);
	       Integer arr [] = new Integer [N];
	       for (int i = 0; i < N; i++) {
	           arr [i] = Integer.parseInt(br.readLine());
	       }
	       
	       int M = Integer.parseInt(st1[1]);
	       while(M--!=0){
	    String str [] = br.readLine().split(" ");
	    Integer a = arr[Integer.parseInt(str[0])-1];
	    if(Integer.parseInt(str[0])== Integer.parseInt(str[1]))
	    	System.out.println(a);
	    else{
	    for(int j = Integer.parseInt(str[0]); j <(Integer.parseInt(str[1])); j++){
	    	int a1 = arr[j];
	    	a = Xor1(a,a1) ;
	    }
	       System.out.println(a);
	       }
	       }
	   }
	}

