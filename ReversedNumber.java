package letcode;

public class ReversedNumber {
	public static void main(String[] args){
		int n = 1256;
		int length = (int) Math.log10(n);
		//System.out.println(length);
		int result = 0;
		for(int i = length ; i >= 0; i--){
			int digit = n % 10;
			//System.out.println(digit);
			n = n/10;
			//System.out.println(n);
			result = result + digit*(int) Math.pow(10, i);
			
		}
		System.out.println(result);
	}
}
