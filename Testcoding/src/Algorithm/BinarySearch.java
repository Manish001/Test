/**
 @author chauhan.manish
 * @Date   19-Jul-2016
 * @Package Name Algorithm
 * @Project Testcoding
 */
package Algorithm;

import java.util.Arrays;

/**
 *@author chauhan.manish
 * @FileName BinarySearch.java
 * @Time 12:16:45 PM
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	
	protected static boolean bSearch(int arr[],int k,int start,int last){
		int mid = start + ((last - start)/2);
		if(start > last)
			return false;
		
		else if(k == arr[mid])
			return true;
		
		else if (k > arr[mid])
			return bSearch(arr,k,mid+1,last);
		else
			return bSearch(arr,k,start,mid-1);
		
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3,12,11,12,2,34,3,4,34,5,6,3,4,34,35,45,4,44,334,34,35,3,23,23,242,32,3,343,54,54,54,6,4};
		Arrays.sort(arr);
		
		if(bSearch(arr,35,0,arr.length-1))
			System.out.println("found");
	}

}
