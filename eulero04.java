package eulero;

public class eulero04 {
	
	public static boolean isPalindrome(long value) {
		String trev = Long.toString(value);
		String rev = new StringBuffer(trev).reverse().toString();
		if ( trev.equals(rev) ) return true;
		return false;
	}
	
	public static void main(String[] args) {
		
		long val = 0;
		long longer = 0;
		
		for (int i=1; i<999; i++) {
			for (int j=1; j<999; j++) {
				
				val = i*j;
				if (isPalindrome(val) && longer<val) {
					
					longer = val;
					System.out.println(longer);
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			}
		}
	}			
}