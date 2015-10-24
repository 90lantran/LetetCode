package letcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordPattern {
	static boolean wordPattern(String pattern, String str) {

		Map<Character, String> map = new LinkedHashMap<Character, String>();
		for (int i = 0; i < pattern.length(); i++) {
			if (map.get(pattern.charAt(i)) == null) {
				map.put(pattern.charAt(i), i + "");
			} else {
				map.put(pattern.charAt(i), map.get(pattern.charAt(i)) + i);
			}
		}
		String[] arr = str.split(" ");
		
		Map<String, String> map1 = new LinkedHashMap<String, String>();
		for (int i = 0; i < arr.length; i++) {
			if (map1.get(arr[i]) == null) {
				map1.put(arr[i], i + "");
			} else {
				map1.put(arr[i], map1.get(arr[i]) + i);
			}
		}
		
		if (map.keySet().size() != map1.keySet().size()){
			return false;
		} 
		
//		for (String s : map.values()){
//			System.out.println(s);
//		}
//		for (String s : map1.values()){
//			System.out.println(s);
//		}
			return map.values().containsAll(map1.values());
	
		
		
//		String[] arr = str.split(" ");
//
//		for (String indices : map.values()) {
//			String[] ind = indices.split("");
//			for (int i = 0; i < ind.length - 1; i++) {
//				if (!arr[Integer.parseInt(ind[i])].equals(arr[Integer
//						.parseInt(ind[i + 1])])) {
//					return false;
//				}
//			}
//
//		}

	
	}
	
	
	public static void main(String[] args){
		System.out.println(wordPattern("abba", "dog cat cat dog"));
	}
}
