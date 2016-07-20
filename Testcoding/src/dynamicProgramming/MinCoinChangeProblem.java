/**
 @author chauhan.manish
 * @Date   21-Jul-2016
 * @Package Name dynamicProgramming
 * @Project Testcoding
 */
package dynamicProgramming;

/**
 *@author chauhan.manish
 * @FileName MinCoinChangeProblem.java
 * @Time 1:35:09 AM
 */
public class MinCoinChangeProblem {

	/**
	 * @param args
	 */
	static int coin[];
	static int ar[] ;
	public static int  getMinCoinChangeProblem(int n){
		for (int i =0; i <= 11; i++) 
			ar[i] = Integer.MAX_VALUE;
		ar[0] = 0;
		for(int i = 1; i <=n; i++)
			for(int j = 0;j < coin.length;j++)
				if(coin[j] <= i){
					int temp = ar[i- coin[j]];
					if(temp != Integer.MAX_VALUE  && ar[i] > temp + 1)
						ar[i] = temp+1;
				}
		
		
		return ar[n];
	}
	public static void main(String[] args) {
		int a [] = {1,2,3,5};
		coin =a;
		ar =new int [12];
		for (int i =0; i <= 11; i++) 
			ar[i] = Integer.MAX_VALUE;
		
		System.out.println(getMinCoinChangeProblem(11));

	}

}
