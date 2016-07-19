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
		System.out.println(mid);
		if(start > last)
			return false;
		
		else if(k == arr[mid])
			return true;
		
		else if (k >= arr[mid])
			bSearch(arr, k,mid+1,last);
		else
			bSearch(arr, k,start,mid-1);
		
		return false;
		
	}
	
	public static void main(String[] args) {
		int arr[]={1,3,22,3,4,5,6,34,4,655,6,7,8,3,4,5,5,6,7,8,8,10};
		Arrays.sort(arr);
		if(bSearch(arr,34,0,arr.length-1))
			System.out.println("found");
	}

}
