package eulero;

public class eulero09 {
	public static void main(String[] args) {
		
		int n = 1000;
		for (int a=0; a<n; a++) {
			for (int b=0; b<n; b++) {
				for (int c=0; c<n; c++) {
					if (a+b+c==1000 && a<b && b<c && a*a+b*b==c*c) {
						 System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
