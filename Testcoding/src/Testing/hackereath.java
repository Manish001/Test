package Testing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 @author chauhan.manish
 * @Date   10-Jul-2016
 * @Package Name 
 * @Project Testcoding
 */

/**
 *@author chauhan.manish
 * @FileName hackereath.java
 * @Time 10:53:21 PM
 */
public class hackereath {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String [] str = line.split(" : ");
        
       int j = str[0].trim().indexOf(str[1].trim());
        int i= 0;
       
       while(j!= -1)
       {
       	j = str[0].trim().indexOf(str[1].trim(),j+1);
       	i++;
       }
       if(i==0)
        System.out.println("no");
        else
        System.out.println("yes : "+(i));
	}

}
