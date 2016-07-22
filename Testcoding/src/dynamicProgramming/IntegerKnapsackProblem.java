/**
 @author chauhan.manish
 * @Date   20-Jul-2016
 * @Package Name dynamicProgramming
 * @Project Testcoding
 */
package dynamicProgramming;

/**
 *@author chauhan.manish
 * @FileName IntegerKnapsackProblem.java
 * @Time 11:46:07 PM
 */

public class IntegerKnapsackProblem {

	/**
	 * @param args
	 */
	static int arr[];
	
	public static int find(int j,int n){
		int max = Integer.MAX_VALUE;
		if(n==0)
			return 0;
		else if(n>0){
			for(int i =j ; i< arr.length; i++){
				int temp =1+ find(i,n-arr[i]);
				if( max > temp)
					max = temp;
			}
		return max;
		}
		else return -1;
	}
	
	public static void main(String[] args) {
		int arr1 [] = {1,2,3,5};
		arr = arr1;
		System.out.println(find(0,11));

	}

}
