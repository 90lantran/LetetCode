package letcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class reverseString {
	static String reverse(String str) {
		
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			ans = str.charAt(i) + ans;
		}

		return ans;
	}

	static boolean permutationOrNot(String s, String t) {
		if (s.length() != t.length())
			return false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) != null) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) != null && map.get(s.charAt(i)) > 0) {
				map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
			} else  {
				return false;
			}
		}
		return true;

	}

	static String replaceWhiteSpace(String s) {
		char[] arr = s.toCharArray();
		char[] newArr = new char[arr.length * 3];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				newArr[j] = arr[i];
				j++;
			} else {
				newArr[j++] = '%';
				newArr[j++] = '2';
				newArr[j++] = '0';
			}
		}
		String answer = "";
		for (int i = 0; i < arr.length * 3; i++) {
			if (newArr[i] == ' ' && newArr[i + 1] == ' ')
				return answer;
			else
				answer += newArr[i];
		}
		return answer;
	}
	
	static String compressString(String str){
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++){
			if (map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		StringBuilder s = new StringBuilder();
		for (Character c : map.keySet()){
			s.append(c).append(map.get(c));
		}
//		for(Character c: map.keySet()){
//			System.out.println(c);
//		}
//		return null;
		return s.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("Hello"));
		System.out.println(replaceWhiteSpace("Mr John Smith   "));
		
		//System.out.println("Mr 23    ".length());
		System.out.println(compressString("Hello"));
	}
}
