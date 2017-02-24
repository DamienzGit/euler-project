package eulero;

public class eulero06 {
	
	public static int getPowSums(int max) {
		int s = 0;
		for (int i=0; i<=max; i++) {
			s += i*i;
			
		}
		return s;
	}
	
	public static int getSumAtTwo(int max) {
		int s = 0;
		for (int i=0; i<=max; i++) {
			s += i; 
		}
		return s*s;
	}
	
	public static void main(String[] args) {
		int x = getSumAtTwo(100) - getPowSums(100); 
		System.out.println(x);
	}

}
