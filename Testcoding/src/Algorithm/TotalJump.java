/**
 @author chauhan.manish
 * @Date   11-Nov-2016
 * @Package Name Algorithm
 * @Project Testcoding
 */
package Algorithm;

import java.util.LinkedList;
import java.util.Queue;

/**
 *@author chauhan.manish
 * @FileName TotalJump.java
 * @Time 10:05:47 PM
 */
public class TotalJump {

	/**
	 * @param args
	 */
	
	
	 static int M,N;
	public static void main(String[] args) {
		int [][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
						};
		M = 4;
		N = 4;
		int x = 1;
		int y = 1;
		int jump = 5;
		int [] i = new int [2];
		i[0] = x;
		i[1] = y;
		Queue<int []> que = new LinkedList<int []>();
		que.add(i);
		boolean flag = true;
		while(flag && !isBoundry(que.peek())){
			i = que.remove();
			int val = arr[i[0]][i[1]];
			int [] j = new int [2];
		if(que.isEmpty()) 
			flag = false;
		else
		if ((val - arr[i[0] -1][i[1]-1]) < jump){
			j[0] = i[0] - 1;
		    j[1] = i[1] - 1;
		    que.add(j);
		}
		if ((val - arr[i[0] -1][i[1]+1]) < jump){
			j[0] = i[0] - 1;
		    j[1] = i[1] + 1;
		    que.add(j);
		}
		if ((val - arr[i[0] +1][i[1]-1]) < jump){
			j[0] = i[0] +1;
		    j[1] = i[1] -1;
		    que.add(j);
		}
		 if ((val - arr[i[0] +1][i[1]+1]) < jump){
			j[0] = i[0] +1;
		    j[1] = i[1] +1;
		    que.add(j);
		}
		}
		
		if(isBoundry(que.peek()))
		System.out.println("YES");
		else
			System.out.println("NO");
		
	}

	public static boolean isBoundry(int [] i){
		
		if(i[0] == 0 || i[0] == N -1 || i[1] == 0 || i[1] == M -1)
			return true;
		return false;
		
	}
}
