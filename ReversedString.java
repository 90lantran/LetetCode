package letcode;

public class ReversedString {
	public static void main(String[] args){
		String s = "Hello World!";
		StringBuilder result = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i-- ){
			result.append(s.charAt(i));
		}
		System.out.println(result.toString());
		
		
		
		long n = 56655633;
		StringBuilder t = new StringBuilder(n + "");
		int start = t.length() % 3;
		if (start == 0) start = 3;
		while ( start != t.length() ){
			t.insert(start,',');
			start += 4;  
					
		}
		System.out.println(t.toString());
	}
	
	
}
