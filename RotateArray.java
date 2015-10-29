package letcode;

public class RotateArray {
	
//	static <T> T[] rotate(T[] arr, int k){
//		int l = arr.length;
//		@SuppressWarnings("unchecked")
//		T[] newArr = (T[]) new Object[l];
//		for(int i = 0 ; i < l; i++){
//			newArr[(k + i) %l] = arr[i]; 
//		}
//		return newArr;
//	}
	
	static Integer[] rotate(Integer[] arr, int k){
		int l = arr.length;
		Integer[] newArr = new Integer[l];
		for(int i = 0 ; i < l; i++){
			newArr[(k + i) %l] = arr[i]; 
		}
		return newArr;
	}
	public static void main(String[] args){
		Integer[] arr = new Integer[]{1,2,3,4,5,6};
		
		for(Integer i : rotate(arr, 2)){
			System.out.println(i);
		}
	}
}
