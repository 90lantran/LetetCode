package letcode;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		//int [][] arr = new int[2][3];
		int size = nums.length;
		for (int i = size - 1; i >= 0; i--){
			for(int j = 0; j < i; j ++){
				if ( nums[j] == 0){
					int temp = nums[j+1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
