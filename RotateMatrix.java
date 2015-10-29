package letcode;

public class RotateMatrix {
	static void transpose(int[][] arr){
		int row = arr.length;
		int col = arr[0].length;
		for(int i = 0; i < row ; i ++){ 
			for (int j = i; j < col; j ++){ // Tricky hereeee , need to see example
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	
	static void swapCol(int[][] arr){
		int row = arr.length;
		int col = arr[0].length;
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col/2; j++){ // tricky here, need to see example
				int temp = arr[i][j] ;
				arr[i][j] = arr[i][col - j -1];
				arr[i][col-j-1] = temp;
			}
		}
		
	}
	public static void main(String[] args){
		int[][] arr = {{1,2,3},{4,5,6,},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		transpose(arr);
		for (int i = 0 ; i < row; i++){
			for(int j = 0 ; j < col; j ++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		swapCol(arr);
		
		
		for (int i = 0 ; i < row; i++){
			for(int j = 0 ; j < col; j ++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
