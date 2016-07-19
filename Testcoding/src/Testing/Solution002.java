/**
 @author chauhan.manish
 * @Date   14-Jul-2016
 * @Package Name Testing
 * @Project Testcoding
 */
package Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *@author chauhan.manish
 * @FileName Solution002.java
 * @Time 8:20:25 PM
 */
public class Solution002 {

	static HashMap<Integer, Integer> find1 = new HashMap<Integer, Integer>();
	
	static int minCoins(int coins[], int m, int V)
	{
		if (V == 0) return 0;


		int res = Integer.MAX_VALUE;


		for (int i=0; i< m; i++)
		{
			if (coins[i] <= V)
			{
				int sub_res = minCoins(coins, m, V-coins[i]);

				if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res){
					res = sub_res + 1;
					if(find1.get(coins[i])==null)
					find1.put(coins[i], 1);
					else
						find1.put(coins[i], find1.get(coins[i])+1);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String [] st1 = line.split(" ");
		int N = Integer.parseInt(st1[1]);
		int arr [] = new int [N];
		String line2 = br.readLine();
		String lin [] = line2.split(" ");
		for (int i = 0; i < N; i++) {
			arr [i] = Integer.parseInt(lin[i]);
		}
		
		for (int i = 0; i < N; i++) {
			find1.put(arr[i], 0);
		}
		
		int a= Integer.parseInt(st1[0]);
		int c =0;
		while(a!=0){
			minCoins(arr,N,a);
			a--;
		}
		
		for (int i = 0; i < N; i++) {
			c += find1.get(arr[i]);
			System.out.println(find1.get(arr[i]));
		}
		
		System.out.println(c);
	}
}
