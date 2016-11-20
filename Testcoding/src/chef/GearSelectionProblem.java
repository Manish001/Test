/**
 @author chauhan.manish
 * @Date   14-Oct-2016
 * @Package Name chef
 * @Project Testcoding
 */
package chef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/**
 *@author chauhan.manish
 * @FileName GearSelectionProblem.java
 * @Time 8:16:56 PM
 */
public class GearSelectionProblem {

	/**
	 * @param args
	 */
	public static void getValue(List<Integer []> list) {
		Integer [] arr = new Integer [2];
		Integer [] arr1 =  {0,0};
	//	List<Integer []> list = new ArrayList<Integer []>();
		List <Integer > solution = new ArrayList<Integer>();
		int D = 8;
		for(int i = 0; i < list.size(); i++){
			Stack<Integer []> stack = new Stack<Integer []>();
			int j = list.size() - 1;
				while((list.get(i)[0] + list.get(j)[0]) >= D ){
					j--;
					if(arr1[0] == 0 && arr1[1] == 0)
						arr1 = list.get(j);
					else 
					{	arr = arr1;
						if(list.get(j)[1] >= arr[1])
							arr1 = list.get(j);
					}
				}
				solution.add(arr1[0]);
		}
		System.out.println(solution.toString());
	}
	
	public static void main(String[] args) {
		List<Integer []> list = new ArrayList<Integer []>();
		
		Integer [] arr1 = {1,5};
		Integer [] arr2 = {3,6};
		Integer [] arr3 = {6,8};
		Integer [] arr4 = {2,3};
		Integer [] arr5 = {5,4};
		
		list.add(arr1);
		list.add(arr2);
		list.add(arr3);
		list.add(arr4);
		list.add(arr5);
		
		getValue(list);
		
	}
}
