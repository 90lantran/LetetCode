package letcode;

public class AddDigits {
	public static int digitalRoot(int num) {
		return num == 0 ? 0 :(num - 9*Math.floorDiv(num - 1, 9));
		
	}

	public static void main(String[] arg) {
		System.out.println(digitalRoot(8));
	}
}
