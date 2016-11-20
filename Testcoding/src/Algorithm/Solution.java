/**
 @author chauhan.manish
 * @Date   22-Oct-2016
 * @Package Name Algorithm
 * @Project Testcoding
 */
package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *@author chauhan.manish
 * @FileName Solution.java
 * @Time 12:46:47 PM
 */
public class Solution {

	protected static int getTotalNumberOfString(String str){
		Set<String> strSet = new HashSet<String>();
		StringBuilder string = new StringBuilder(str);
		strSet.add(str);
		for(int i = 0 ; i < str.length() ; i++){
			string.append(string.toString().charAt(0));
			strSet.add(string.deleteCharAt(0).toString());
		}
		System.out.println(strSet.toString());
		return strSet.size();
		
	}
	//-------------------------------------------------------
	
    //  compare
    protected static boolean getValues(char [] arr,char [] arr1){
    	if(arr[0] == arr1[0] || arr[1] == arr1[1])
    	return true;
    	
    	return false;
    }
    
    protected static Long gettotalnumberofSpecialFamily(List <char [] > list,int a, int b){
    	Long lng = 0L ;
		for(int i = a; i <= b; i++)
			for(int j = i+1; j <= b;j++)
				if(getValues(list.get(i),list.get(i)))
					lng++;
    	return lng;
    	
    }
	public static void main(String[] args) throws IOException{

		/*String str = "abc";
		System.out.println(getTotalNumberOfString(str));*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String foodType = br.readLine();
        String sleepType = br.readLine();
        List <char [] > list = new ArrayList<char []>();
        
		for ( int i = 0; i< N ; i++){
			char [] ch = new char [2];
			ch[0] = foodType.charAt(i);
			ch[1] = sleepType.charAt(i);
			list.add(ch);
		}
		N = Integer.parseInt(br.readLine());
		for ( int i = 0; i< N ; i++){
			String query = br.readLine();
			int a = Integer.parseInt(query.split(" ")[0]);
			int b = Integer.parseInt(query.split(" ")[1]);
			System.out.println(gettotalnumberofSpecialFamily(list,a,b));
	    }
	}
}
