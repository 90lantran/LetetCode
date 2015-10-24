package letcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramToPalindrom {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String src = (in.nextLine());
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		for (int i = 0; i < src.length(); i++) {
			if (myMap.containsKey(src.charAt(i))){
				myMap.put(src.charAt(i), myMap.get(src.charAt(i)) +1);
			} else {
				myMap.put(src.charAt(i), 1);
			}
		}
		
		for ( Integer x: myMap.values()){
			if (x%2 == 1){
			
			}
		}
		System.out.println("YES");
	}

}
