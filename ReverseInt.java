package letcode;

public class ReverseInt {
	static int reverse(int x) {
		int length = (int) Math.log10(Math.abs(x));
		String prefix = x < 0 ? "-" : "";
		try {
			return Integer.parseInt(prefix + helper(Math.abs(x), length, ""));
		} catch (Exception e) {
			return 0;
		}
	}

	static String helper(int x, int length, String result) {

		if (length == 0) {
			return x + result;
		} else {
			return helper(x % (int) Math.pow(10, length), length - 1, x
					/ (int) Math.pow(10, length) + result);
		}

	}

	public static void main(String[] args) {

		System.out.println(reverse(123));
		System.out.println(reverse(-890));
		System.out.println(reverse(-123));
		System.out.println(reverse(1534236469));
	}
}
