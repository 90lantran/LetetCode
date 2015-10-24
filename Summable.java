package letcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * summable(5,[1,2,3]) -> true summable(4,[6,9]) ->false
 * 
 * @author alantran
 *
 */
public class Summable {
	public boolean summable(int n, Integer[] arr) {
		boolean result = false;
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result || summable(n, arr, i);
		}
		return result;
	}

	private boolean summable(int n, Integer[] arr, int currentIndex) {
		if (currentIndex >= 0) {
			if (n - arr[currentIndex] == 0) {
				return true;
			} else if (n - arr[currentIndex] > 0) {
				return summable(n - arr[currentIndex], arr, currentIndex - 1);
			} else {
				return summable(n, arr, currentIndex - 1);
			}
		} else {

			return false;
		}
	}

	public static void main(String[] args) {
		Summable a = new Summable();
		List<Integer> list = new ArrayList<Integer>();
		// list.addAll(new {6,9,1,4,17 })
		list.add(8);
		list.add(34);
		list.add(65);
		list.add(565);
		list.add(2);
		list.add(7);
		list.add(9);
		list.add(3);
		list.add(17);
		list.add(21);
		list.add(55);
		list.add(5);

		Collections.sort(list);
		Integer[] arr = list.toArray(new Integer[list.size()]);
		System.out.println(a.summable(18, arr));
		// 18, [8, 34,65, 565, 2, 7,9, 3, 17, 21,55, 5]
	}
}
