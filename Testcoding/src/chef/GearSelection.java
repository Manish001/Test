/**
 @author chauhan.manish
 * @Date   14-Oct-2016
 * @Package Name chef
 * @Project Testcoding
 */
package chef;

import java.util.ArrayList;
import java.util.List;

/**
 *@author chauhan.manish
 * @FileName GearSelection.java
 * @Time 8:14:45 PM
 */
public class GearSelection {

	public static void main(String[] args) {

		int distance = 8;
		int[] radius = { 1, 3, 6, 2, 5 };
		int[] cost = { 5, 6, 8, 3, 4 };

		int[] ans = Circles(distance, radius, cost);

		for (int i = 0; i < ans.length; i++)
			System.out.println(ans[i] + " ");
	}

	static int[] Circles(int distance, int[] radius, int[] cost) {
		int[] result = new int[radius.length];
		for (int i = 0; i < radius.length; i++) {
			List<Integer> tmp = new ArrayList<Integer>();
			for (int j = 0; j < radius.length; j++)
				if (radius[j] >= distance - radius[i])
					tmp.add(j);
			result[i] = getSmallest(radius, cost, tmp, i);
		}
		return result;
	}

	protected static int getSmallest(int[] radius, int[] cst, List<Integer> temp, int i) {
		if (temp.size() == 0)
			return 0;
		int result = temp.get(0);
		int mincost = cst[i] + cst[temp.get(0)];
		for (int j = 1; j < temp.size(); j++)
			if (cst[i] + cst[temp.get(j)] < mincost) {
				mincost = cst[i] + cst[temp.get(j)];
				result = temp.get(j);
			}
		return result + 1;
	}

}
