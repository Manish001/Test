/**
 @author chauhan.manish
 * @Date   30-Jul-2016
 * @Package Name Algorithm
 * @Project Testcoding
 */
package Algorithm;

/**
 *@author chauhan.manish
 * @FileName AlgoForAbcd.java
 * @Time 5:58:46 PM
 * Reach from (a,b) to (c,d) using (a+b,b) or (a,b+a)
 */
public class AlgoForAbcd {

	static int c,d;
	private static String ifPossible(String str){
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		if(a > c ||  b > d)
			return null;
		if(a == c &&  b == d){
			return Integer.toString(a)+" "+ Integer.toString(b);
		}
		else{
			String string = ifPossible(Integer.toString(a+b)+" "+ Integer.toString(b));
			if(string == null)
				return   ifPossible(Integer.toString(a)+" "+ Integer.toString(b+a));
			else 
				return string;	
		}
	}
	
	public static void main(String[] args) {
		// 1,4,5,9
		// if a or b equals zero the make it equal to other 
		c = 2;
		d = 3;
		if(ifPossible(Integer.toString(1)+" "+ Integer.toString(1))!= null)
		System.out.println("YES");
		else
			System.out.println("NO");
		

	}

}
