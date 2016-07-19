/**
 @author chauhan.manish
 * @Date   18-Jul-2016
 * @Package Name Testing
 * @Project Testcoding
 */
package Testing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *@author chauhan.manish
 * @FileName Inversion.java
 * @Time 12:23:46 AM
 */
public class Inversion {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		List <String> str = Files.readAllLines(Paths.get(System.getProperty("user.dir")+"/src/Testing/IntegerArray.txt"));
		int count = 0,i = 0;
		while(i < str.size()){
			String st = str.get(i++);
			StringBuffer st1 = new StringBuffer(st);
			if(str.contains(st1.reverse().toString()))
					count ++;
		}
		System.out.println(count/2);
		

	}

}
