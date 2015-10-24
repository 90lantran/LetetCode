package letcode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class differentK {
	public static int kDifferent(int[] arr, int k) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 1);
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - k)) {
				count++;
			}
			if (map.containsKey(arr[i] + k)) {
				count++;
			}
		}

		Map<Integer, Integer> m = new Hashtable<Integer, Integer>();
		//return (int) Math.ceil(count / 2.0);
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] temp1 = line.split(" ");
		int n = Integer.parseInt(temp1[0]);
		int k = Integer.parseInt(temp1[1]);
		line = sc.nextLine();
		String[] temp2 = line.split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp2[i]);
		}
		System.out.println(kDifferent(arr, k));
		sc.close();
	}
}
