/**
 @author chauhan.manish
 * @Date   19-Nov-2016
 * @Package Name iONCoreJava
 * @Project Testcoding
 */
package iONCoreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@author chauhan.manish
 * @FileName MoksAndNotMonk.java
 * @Time 2:23:00 PM
 */
public class MoksAndNotMonk {

	static int monk[];
	static int notMonk[];
	
	private static int search(int[] arr, int key){
        
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
	// flag true for querying by monk
	protected static int f(int a,boolean flag){
		int key = 0;
		if(flag)
			key = search(notMonk, a);
		else
			key = search(monk, a);
		return key;
	}
	protected static int g(int a,boolean flag){
		int key = 0;
		if(flag){
			key = search(notMonk, a);
			while(key <= notMonk.length-1 && notMonk[key] == notMonk[key +1])
				key ++;
			return notMonk.length - key;
		}
		else{
			key = search(monk, a);
			while(key <= monk.length-1 && monk[key] == monk[key +1])
				key ++;
			return monk.length - key;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	br.readLine();
        String [] str = br.readLine().split(" ");
        monk = new int[str.length];
        int i1 =0;
        for (String string : str) {
        	monk[i1++] = Integer.parseInt(string);
		}
        String [] str1 = br.readLine().split(" ");
        notMonk = new int[str1.length];
        int i2 =0;
        for (String string : str1) {
        	notMonk[i2++] = Integer.parseInt(string);
		}

        int monkScore = 0 ;
        int notMonkScore = 0;
        
        for (int i : monk) {
        	monkScore += f(i,true)*g(i,true);
		}
        for (int i : notMonk) {
        	notMonkScore += f(i,false)*g(i,false);
		}
        
        if(monkScore > notMonkScore) 
        	System.out.println("MONK");
        else if (monkScore == notMonkScore)
        	System.out.println("TIE");
        else
        	System.out.println("!MONK");
	}

}
