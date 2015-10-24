package letcode;

public class p1 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int numRow = matrix.length;
		int numCol = matrix[0].length;
		boolean[] ans = new boolean[numRow];
		boolean result = false;
		//boolean temp = false;
		for (int i = 0; i < numRow; i++) {
			ans[i] = BinarySearch(0,numCol -1, target, matrix[i]);
		}
		for(int i = 0; i < numRow; i++){
			result = result || ans[i];
		}
		return result;
	}

	private boolean BinarySearch(int start, int end, int target, int[] arr) {
		if (start <= end) {
			int middle = (start + end) / 2;
			if (arr[middle] == target) {
				return true;
			} else if (arr[middle] > target) {
				return BinarySearch(start, middle - 1, target, arr);
			} else {
				return BinarySearch(middle + 1, end, target, arr);
			}
		}
		return false;
	}
	
	public static void main(String [] args){
		p1 ob = new p1();
		int[][] arr={{1}, {1}};
		System.out.println(ob.searchMatrix(arr, 115));
	}
}
