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

		private static void printNextElement(int arr[], int n)
		{
		    int next, i, j;
		    for (i=0; i<n; i++)
		    {
		        next = -1;
		        for (j = i+1; j<n; j++)
		        {
		            if (arr[i] < arr[j])
		            {
		                next = arr[j];
		                break;
		            }
		        }
		        System.out.println(arr[i]+" "+ next);
		    }
		}
	
	   public static void main(String args[] ) throws Exception {
	       
	     /*  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       String line = br.readLine();
	       String [] st1 = line.split(" ");
	       int n = st1.length;
	       int arr [] = new int [st1.length];
	       for (int i = 0; i < st1.length; i++) {
	           arr [i] = Integer.parseInt(br.readLine());
	       }
	       */
		   int arr[]={4,5,2,25};
		   int n = arr.length;
	       int next, i, j;
		    for (i=0; i<n; i++)
		    {
		        next = -1;
		        for (j = i+1; j<n; j++)
		        {
		            if (arr[i] < arr[j])
		            {
		                next = arr[j];
		                break;
		            }
		        }
		        System.out.println(next);
		    }
	       
	   }
}

