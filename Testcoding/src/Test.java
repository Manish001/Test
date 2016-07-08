import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		InputStreamReader	i	=	new	InputStreamReader(System.in);
		BufferedReader	br	=	new	BufferedReader(i);
			int	inte	=	Integer.parseInt(br.readLine());
			char	c	=	(char)	br.read();
			br.skip(1);
			String	str	=	br.readLine();
			System.out.println(inte+" "+c+" "+str);
	}

}
