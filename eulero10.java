package eulero;
import java.math.BigInteger;

import eulero.eulero07;

public class eulero10 {
	
	public static void main(String[] args) {
		long m = 2000000L;
		BigInteger s = BigInteger.valueOf(0);
		for (int i=1; i<m; i++) {
			if ( eulero07.isPrime(i) ){
				s = s.add(BigInteger.valueOf(i));
			}
		} System.out.println(s);
	}
}
