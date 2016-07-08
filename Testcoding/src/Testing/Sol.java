package Testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sol {

	public static int gcd(int a, int b) {
		if (b==0) return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 br.readLine();
		 String line = br.readLine();
       String arr[]	=line.split(" ");
      int k1=1;
		int g = gcd(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
		if(g==1)
			k1++;
		for (int j=1;j<arr.length;j++)
		for (int i=j;i<arr.length;i++)
		{
		  g  = gcd(g,Integer.parseInt(arr[i]));
		  if(g==1)
				k1++;
		}
			System.out.println(k1);
	}
}
