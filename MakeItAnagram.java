package letcode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakeItAnagram {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		String src = (in.nextLine());
		String tar = in.nextLine();
		int length = 0;
		Map<Character, Integer> an = new HashMap<Character, Integer>();

		for (int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			if (an.containsKey(c))
				an.put(c, an.get(c) + 1);
			else
				an.put(c, 1);
		}

		for (int j = 0; j < tar.length(); j++) {
			char c = tar.charAt(j);
			if (an.containsKey(c) && an.get(c) != 0) {
				an.put(c, an.get(c) - 1);
				length += 1;
			}
//			}else if(!an.containsKey(c)){
//				an.put(c, 1);
//			}

		}
//		int output = 0;
//		for (Integer x : an.values()) {
//			output += x;
//		}
		System.out.println(tar.length()+src.length()-length);

	}
}
