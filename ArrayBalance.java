package letcode;

public class ArrayBalance {
	public static int isArray_Balanced(int[] arr) {
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		int leftSum = 0;
		for (int i = 0; i < arr.length; i++) {

			if ((totalSum - arr[i]) / 2 == leftSum) {
				return 1;
			} else {
				leftSum += arr[i];
			}
		}
		return 0;
	}

	public static void main(String[] args) {

		// int[] arr = { 4, 1, 2, 3, 3 };
		int[] arr = { 1, 1, 1, 1, 1 };
		// int[] arr = { 4, 1, 2, 3, 3 };
		// int[] arr = { 4, 1, 2, 3, 3 };
		System.out.println(isArray_Balanced(arr));
	}

}
