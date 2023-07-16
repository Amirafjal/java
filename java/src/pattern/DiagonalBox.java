package pattern;

public class DiagonalBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		int i;
		int j;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(i==j || i+j==n-1 || j-i==(n-1)/2 || i+j==(n-1)/2 || 
						i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2 || 
						i==0 || i==n-1 || j==0 || j==n-1) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
//			for(j=0; j<n; j++) {
//				if(i+j==n-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
			System.out.println();
		}
		
	}

}
