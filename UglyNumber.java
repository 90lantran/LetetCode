package letcode;

public class UglyNumber {
	public boolean isUgly(int num) {
		if (num > 1) {
			if (num % 2 == 0) {
				return isUgly(num / 2);
			} else if (num % 3 == 0) {
				return isUgly(num / 3);
			} else if (num % 5 == 0) {
				return isUgly(num / 5);
			}
		} else if (num == 1) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		UglyNumber test = new UglyNumber();
		for (int i = 1; i < 40; i++) {
			if (test.isUgly(i))
				System.out.println(i);
		}
	}
}
