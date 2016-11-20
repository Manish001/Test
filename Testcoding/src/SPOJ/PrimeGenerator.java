/**
 @author chauhan.manish
 * @Date   22-Jul-2016
 * @Package Name SPOJ
 * @Project Testcoding
 */
package SPOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;

/**
 *@author chauhan.manish
 * @FileName PrimeGenerator.java
 * @Time 10:57:44 PM
 */
public class PrimeGenerator {
	
	static boolean[] helper = new boolean [1000000002];
	static {
		for(int i = 0; i < 1000000001; i++)
			helper[i] = false;
	}
	private static void generate(){
		for(int i = 2; i < 1000000001; i++){
			if(helper[i] == false && isPrime(i)){
				helper[i] = true;
				int j = i*i;
				int k =1;
				while(j < 1000000001){
					System.out.println(j);
					helper[j] = false;
				j=(i*i)*k++;
				}
			}
		}
	}
	
	private static boolean isPrime(int num){
		int flag = 1;
		for(int i = 2 ; i < Math.sqrt(num); i++){
			if(helper[i] == false && num % i == 0){
				flag = 0;
				break;
			}
			else if(helper[i] == true)
				break;
		}
		if(flag == 1)
		return true;
		else
			return false;
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		generate();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- != 0){
			String str = br.readLine();
			int start = Integer.parseInt(str.split(" ")[0]);
			int end = Integer.parseInt(str.split(" ")[1]);
			
			for(int i = start; i<= end  ;i++ )
				if(helper[i] == true)
					System.out.println(i);
		}

	}

}
