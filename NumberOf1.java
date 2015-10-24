package letcode;

public class NumberOf1 {
	
	public static int convert(int n) {
		  return Integer.valueOf(String.valueOf(n), 16); // only support 8 and 16, something wronggggg
		  
		}
public static void main(String[] args){
	int x = 456;
	int count = 0;
	//int binary = convert(5);
//	while (x > 1){
//	
//	//int bimask = 0xF;
//	//System.out.println(convert(x) & 0x1);
//		count += (binary & 0x1);
//		binary = binary >> 1;
//	}
//	System.out.println(count);
	
	while (x > 0){
		System.out.println(x & 0xF);
		x= x >> 4;
	}
}
}
