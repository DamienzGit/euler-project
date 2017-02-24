package eulero;

public class eulero07 {
	public static boolean isPrime(int value) {
		if (value==0) return false;
		if (value==1) return true;
		if (value%2 == 0) return false;
		for (int i=3; i<value; i++) {
			if (value%i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		int prime = 0;
		int c = 1;
		for (int i=1; c<10002; i++) {
			if (isPrime(i)) {
				prime = i;
				System.out.println(c + " " + prime);
				c++;
			}
		}
	}
}
