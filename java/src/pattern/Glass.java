package pattern;

public class Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=22;
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if ( j==0 && i>=(n-1)/8 && i<=7*(n-1)/8 || j==(n-1)/2 && 
						i>=(n-1)/8 && i<=7*(n-1)/8 || i==(n-1)/16 && j<(n-1)/2 && j>0
						|| i==3*(n-1)/16 && j<(n-1)/2 && j>0 || i==13*(n-1)/16 &&
						j<(n-1)/2 && j>0 || i==15*(n-1)/16 && j<(n-1)/2 && j>0 ||
						i==(n-1)/4 && j>=(n-1)/2 && j<5*(n-1)/8 || j==5*(n-1)/8 &&
						i>(n-1)/4 && i<5*(n-1)/8 || i==5*(n-1)/8 && j>=(n-1)/2 && 
						j<5*(n-1)/8 || j==3*(n-1)/4 && i<3*(n-1)/4 && i>3*(n-1)/16 ||
						i==3*(n-1)/16 && j>=(n-1)/2 && j<3*(n-1)/4 || i==3*(n-1)/4 &&
						j>=(n-1)/2 && j<3*(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
