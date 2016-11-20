/**
 @author chauhan.manish
 * @Date   31-Jul-2016
 * @Package Name javaThingsPractice
 * @Project Testcoding
 */
package javaThingsPractice;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *@author chauhan.manish
 * @FileName PracticeWithPrintStream.java
 * @Time 12:18:59 AM
 */
public class PracticeWithPrintStream {

	/**
	 * @param args
	 */
	private static PrintStream pr;
	public static void main(String[] args) throws FileNotFoundException {
		pr = new PrintStream(System.getProperty("user.dir")+"/hello.txt");
		pr.println("test");
		
	}

}
