package letcode;

public class RecursionSum {
	public static void main(String[] args){
		int[] arr = {1, 2,3 ,4,5};
		int currentSum = 0;
		RecursionSum x = new RecursionSum();
		
		int sum = x.calculateSum(arr,arr.length-1, currentSum);
		System.out.println(sum);
	}
	
	private int calculateSum(int[] arr, int index, int currentSum ){
		if (index < 0){
			return currentSum;
		}
		return calculateSum(arr, index - 1, currentSum + arr[index]);
		
	}
}
