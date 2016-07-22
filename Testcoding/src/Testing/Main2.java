package Testing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
/**
 * @author chauhan.manish
 * @FileName Main.java
 * @Time 11:24:38 PM
 */
public class Main2{
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt() ;
       int m = sc.nextInt() ;
       int i = 0 ;
       int [][] data = new int [n - 1][2] ;
       while (i < n - 1) {
    	   data[i][0] = sc.nextInt() ;
    	   data[i][1] = sc.nextInt() ;
    	   i++;
       }
       i = 0 ;
       int [][] query = new int [m][2] ;
       while (i < m) {
    	   query[i][0] = sc.nextInt() ;
    	   query[i][1] = sc.nextInt() ;
    	   i++;
       }
       path(data, query, n);
	}

	
	public static HashMap<Integer,List<Integer>> makeGrph (int n, int [][] ar){
		HashMap<Integer,List<Integer>> grph = new HashMap<> ();
		for (int i = 1 ; i <= n ; ++i) {
			grph.put(i, new ArrayList<Integer>());
		}		
		for (int [] a : ar) {
			grph.get(a[0]).add(a[1]) ;
			grph.get(a[1]).add(a[0]) ;
		}		
		return grph ;
	}
	
	public static void path (int [][] ar, int [][] query,int n){
		HashMap<Integer,List<Integer>> grph = makeGrph (n ,ar);
	
		HashMap<Integer,Boolean> city = new HashMap<> ();
		city.put(1, true) ;		
		for (int [] a : query) {
			if (a[0] == 1) {				
				city.put(a[1], true) ;
			} else {				
				search (grph,city, a[1]);
			}
		}
	}
	
	public static void search (HashMap<Integer,List<Integer>> grph, HashMap<Integer,Boolean> city , int start){
		HashMap<Integer,Integer> visited = new HashMap<> ();	
		Queue<Integer> q = new LinkedList<> () ;
		visited.put(start, 0) ;
		q.offer(start) ;
		while (!q.isEmpty()) {			
			int cur = q.poll() ;
			if (city.containsKey(cur)) {
				System.out.println(visited.get(cur));
				break;
			}
			for (int n : grph.get(cur)) {
				if (!visited.containsKey(n)) {
					visited.put(n, visited.get(cur) + 1) ;
					q.add(n) ;
				}
			}
		}
	}
}

