package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UniquePalindrome {
	static char arr[];
	static int k=1;
	static Set<String> mani = new HashSet<String>();
	public static void swap(int i,int j){
		char c= arr[i];
		 arr[i] = arr[j];
		 arr[j] = c;	
	}
	public static boolean isPaliondrom(String str)
	{
		 int lower = 0;
		    int higher = str.length() - 1;
	 	 
		    while (higher > lower)
		    {
		        if (str.charAt(lower)!= str.charAt(higher))
		        {
		            return false;
		        }
		        lower++;
		    	higher--;
		    }
		 
		return true;
		
	}
	public static void getPermute(int i){
		if(i==arr.length-1){
			//System.out.print((k++)+" ");
			for (char c : arr) {
				//System.out.print(c);
			}
			//System.out.println();
			mani.add(new String(arr));
		}
		else
			for(int j = i; j < arr.length; j++ ){
				swap(i,j);
		   		getPermute(i+1);
		   		swap(i,j);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = br.readLine().toCharArray();
		getPermute(0);
		
		for (String string : mani) {
			if(isPaliondrom(string))
			{
			System.out.println(string);
			}
		}
	}
	
}