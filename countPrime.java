package letcode;

import java.util.Scanner;

public class countPrime {
	public static void main(String[] args) {
		Scanner scc = new Scanner(System.in);
		int n = scc.nextInt();
		countPrime c = new countPrime();
		int count = 0;
		for (int i = n; i > 1; i--) {
			if (i == 2) {
				count++;
				break;
			} else if (c.isPrime(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

	private boolean isPrime(int n){
		for (int i = 2; i * i <= n ; i+= 2){
			if (n%i == 0){
				return false;
			}
		}
		return true;
	}
}
