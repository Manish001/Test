/**
 @author chauhan.manish
 * @Date   14-Oct-2016
 * @Package Name chef
 * @Project Testcoding
 */
package chef;

/**
 *@author chauhan.manish
 * @FileName CupCakeFeast.java
 * @Time 7:47:45 PM
 */
public class CupCakeFeast {

	/**
	 * @param args
	 */
	protected static int getCupcakeFromWrapper(int num , int m){
		
		int count = 0;
		while(num >= m){
		count += (num / m ) ;
		int i = num;
		num = (i / m );
		num = num + (i % m);
		}
		return count;
		
	}
	
	
	protected static int getMaxCake(String str){
		String [] string = str.split(" ");
		int n = Integer.parseInt(string[0]);
		int c = Integer.parseInt(string[1]);
		int m = Integer.parseInt(string[2]);
		
		return ( (n / c) + getCupcakeFromWrapper((n / c) , m));	
	}
	public static void main(String[] args) {
		System.out.println("qwertyuiop");
		System.out.println(getMaxCake("6 2 2"));
		
	}

}
