import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main
{
	static List<Long> ls = new ArrayList<Long>();
	
	public static boolean isPrime(Long i){
		List<Long> lg =new ArrayList<Long>();
		Long temp = 2L ;
		Long sq = (long) Math.sqrt((double) i)+1;
			
		for (Long long1 : ls) {
				temp = long1;
				if(i % temp ==0)
					return false;
				if(temp >= sq)
					return false;
			}
		return false;
	}

	public static void generate(){
		
		Long lon= 31622L;
		for(long l = 2 ; l <= 31622 ; l++){
			boolean flag = true;
			for (Long long1 : ls) {
				if(l % long1 == 0){
					flag=false;
					break;
				}
				if(long1 > (long)Math.sqrt(l)+1)
					break;
			}
			if(flag) ls.add(l);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		generate();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long l = Long.parseLong(br.readLine());
		while(l!=0){
			String str = br.readLine();
			String  s1 [] = str.split(" ");
			for(Long i = Long.parseLong(s1[0]) ; i <= Long.parseLong(s1[1]) ; i++)
				if(isPrime(i)) 
					System.out.println(i);
			l--;
		}

	}

}
