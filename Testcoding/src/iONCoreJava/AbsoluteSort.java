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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@author chauhan.manish
 * @FileName AbsoluteSort.java
 * @Time 1:37:06 PM
 */
public class AbsoluteSort {
	     
	    public static void main(String a[]) throws IOException{
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	br.readLine();
	        String [] str = br.readLine().split(" ");
	        int[] input = new int[str.length];
	        int i1 =0;
	        for (String string : str) {
				input[i1++] = Integer.parseInt(string);
			}

	        List<Integer> ls = new ArrayList<Integer>();
	         int i =0;
	       while(i < input.length){
	    	   if(input[i] < 0){
	    		   ls.add(input[i]);
	    		   input[i] = Math.abs(input[i]);
	    	   }
	    	   i++;
	       }
	       Object[] arr = ls.toArray();
	       Arrays.sort(input);
	       Arrays.sort(arr);
	       int j=arr.length - 1;
	       i=0;
	       while(j >= 0 && i < input.length){
	    	   if(input[i] == Math.abs((int) arr[j])){
	    		   input[i] = Math.negateExact(input[i]);
	    		   j--;
	    	   }
	    	   i++;
	       }
	      
	        for(int m:input){
	        	System.out.print(m);	
	            System.out.print(" ");
	        }
	    }
	}

