package letcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToLong {
	/**
	 * Convert a string to 64-bit signed integer
	 * @param str
	 * @return a number of type long which represents str
	 */
	static long convert(String str) {
		// 64-bit signed integer is type long in Java
		// A valid input only contain digits, '+' or '-'
		String regex = "^([-|+])?(\\d+)$";
		long sum = 0;
		boolean isNegative = false;
		if (str.matches(regex)) {
			// Try catch input string has more than 19 digits
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(str);
			while (m.find()) {
				if (m.group(2).length() > 19) {
					throw new NumberFormatException(str
							+ " is not in the range of 64-bit signed integer.");
				}
			}
			char[] arrChar = str.toCharArray();
			// input may has '-' or '+' in the front
			if (arrChar[0] == '-' || arrChar[0] == '+') {
				if (arrChar[0] == '-')
					isNegative = true;
				int[] arrInt = new int[str.length() - 1];
				for (int i = 1; i < arrChar.length; i++) {
					arrInt[i - 1] = arrChar[i] - '0';
				}

				// Convert string to 64-bit signed integer (long)
				sum = convertToLong(arrInt, isNegative, str);

			} else { 
				int[] arrInt = new int[str.length()];
				for (int i = 0; i < arrChar.length; i++) {
					arrInt[i] = arrChar[i] - '0';
				}
				sum = convertToLong(arrInt, isNegative, str);
			}
			return sum;

		} else {
			throw new NumberFormatException(
					"Invalid input, input must represent an integer in base 10, without any letters or decimal point.");
		}
	}

	/*
	 * 
	 */
	/**
	 * Helper function to convert array of integer to a long integer composed by
	 * them in base 10. Check overflow every time adding another digit.
	 * @param arr array of integer
	 * @param isNegative a boolean to indicate a number is negative or not
	 * @param str the input string
	 * @return a a number of type long which represents str
	 */
	static long convertToLong(int[] arr, boolean isNegative, String str) {
		long sum = 0;
		long checkSum;
		if (isNegative) {
			for (int i = 0; i < arr.length; i++) {
				checkSum = sum * 10 - arr[i];
				if (checkSum > sum) {
					throw new NumberFormatException(str
							+ " is not in the range of 64-bit signed integer.");
				}
				sum = checkSum;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				checkSum = sum * 10 + arr[i];
				if (checkSum < sum) {
					throw new NumberFormatException(str
							+ " is not in the range of 64-bit signed integer.");
				}
				sum = checkSum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		StringToLong p = new StringToLong();
		// String s1 =
		// "-12334573647823647326473264873264763478632748632746327647324673264732647326476324763274632746736473642734267632737846237846732864732647364634736476327";
		// System.out.println(p.convert(s1));
		// String s2 =
		// "123647326473264723647326746327463726473264732647364873264783647637463784637647832647637486378463743647364763748637482647236437864736736478326473647637486378463647836437647364763478";
		// System.out.println(p.convert(s2));
		String s3 = "+1345678789";
		System.out.println(p.convert(s3));
		String s4 = "+0";
		System.out.println(p.convert(s4));
		String s5 = "-2342343242342423432";
		System.out.println(p.convert(s5));
		String s6 = "";
		// System.out.println(p.convert(s6));

		String s8 = "9223372036854775807";
		System.out.println(p.convert(s8));
		String s9 = "-9223372036854775808";
		 System.out.println(p.convert(s9));

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		// System.out.println(Long.parseLong("+2342"));
	}
}
