package letcode;

public class BinaryZeros {
	
	public int binaryZeros(int n){
		int numberZeros = 0;
		while(n > 0){
			if(n%2 == 0) numberZeros++;
			n /= 2;
		}
		return numberZeros;
	}
}
