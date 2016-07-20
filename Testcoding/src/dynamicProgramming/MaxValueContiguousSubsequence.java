/**
 @author chauhan.manish
 * @Date   20-Jul-2016
 * @Package Name dynamicProgramming
 * @Project Testcoding
 */
package dynamicProgramming;

/**
 *@author chauhan.manish
 * @FileName MaxValueContiguousSubsequence.java
 * @Time 10:49:09 PM
 */
public class MaxValueContiguousSubsequence {

	/**
	 * @param args
	 */
	static int arr[];
	public static int getMaxValueContiguousSubsequence(){
		int max=0;
		for(int i=0; i<arr.length;i++)
			for(int j=arr.length-1;j>=i;j--){
				int temp = 0;
				for(int k=i; k<j;k++){
					temp+=arr[k];
					if(max < temp)
						max =temp;
				}
			}
		return max;	 
	}
	
	public static int getMaxValueContiguousSubsequenceOpt1(){
		int max=0;
		for(int i=0; i<arr.length;i++){
			int temp = 0;
			for(int j=i;j<=arr.length-1 ;j++){
					temp+=arr[j];
					if(max < temp)
						max =temp;
				}
			}
		return max;	 
	}
	
	public static int getDPSolution(){
		int max = arr[0];
		int temp = 0;
		for(int i =0; i < arr.length; i++){
			temp = Math.max(temp+arr[i], arr[i]);
			max = Math.max(temp, max);
		}
		return max;
	}
	
	public static void main(String[] args) {
		int arr1[] = {-2,11,-4,13,-5,2};
		arr =arr1;
		System.out.println(getMaxValueContiguousSubsequenceOpt1());
		System.out.println(getDPSolution());
	}

}
