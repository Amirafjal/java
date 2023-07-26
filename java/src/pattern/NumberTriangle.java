package pattern;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				if(true) {
					System.out.print(j+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
