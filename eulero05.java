package eulero;

public class eulero05 {
	
	public static boolean dividible(int n) {
		for (int j=1; j<=20; j++) {
			
			if (n%j != 0) return false; 
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		int i = 0;
		while(true) {
			if (dividible(i)) {
				System.out.println(i);
				i++;
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
