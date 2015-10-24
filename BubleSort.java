package letcode;

import java.util.Scanner;

public class BubleSort {
	
	public void sort(int[] input){
		int numSwap = 0;
		for(int i= input.length - 1;i >= 0; i-- ){
			for( int j = 0; j < i; j++){
				if (input[j] > input[j+1]){
					numSwap++;
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
			}
		}
		System.out.println(numSwap);
		for (int x : input){
			System.out.print(x+ " ");
		}
	}
	public static void main(String[] args){
//		BubleSort p = new BubleSort();
//		if(args.length > 0){
//			int[] input = new int[args.length];
//			 try {
//			        for(int i = 0; i < args.length; i++){
//			        	input[i] = Integer.parseInt(args[i]);
//			        }
//			    	//input = {985 ,0, 682 ,163 ,959 ,714 ,809 ,45 ,131 ,729 ,343 ,717, 94 ,686 ,811 ,60 ,83 ,813 ,945 ,290 ,196 ,673 ,413 ,610, 753};
//					p.sort(input);
//			    } catch (NumberFormatException e) {
//			        System.err.println("Argument" + args[0] + " must be an integer.");
//			        System.exit(1);
//			    }
//		}
		
		Scanner in = new Scanner(System.in);
		String src = (in.nextLine());
		
		int a[] = new int[100];
		//String line = br.readLine(); // to read multiple integers line
		String[] strs = src.trim().split("\\s+");
		for (int i = 0; i < 100; i++) {
		    a[i] = Integer.parseInt(strs[i]);
		}
		
		BubleSort p = new BubleSort();
		p.sort(a);
	
	}
	
}
