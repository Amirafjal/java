package pattern;

public class Hand {

	public static void main(String[] args) {
		int n=34;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (i==(n-1)/2 && j<=(n-1)/4 || i==5*(n-1)/8 && j<=(n-1)/4|| j==0 && i<=5*(n-1)/8 && i>=(n-1)/2
						|| j==(n-1)/4 && i>(n-1)/8 || i==(n-1)/2 && j>(n-1)/4 && j<=7*(n-1)/8
						|| j==7*(n-1)/8 && i>(n-1)/8 || j==3*(n-1)/8 && i<=(n-1)/2 &&
						i>(n-1)/8 || j==(n-1)/2 && i<(n-1)/2 && i>0 ||
						j==5*(n-1)/8 && i<=(n-1)/2 && i>0 || j==3*(n-1)/4 && i>(n-1)/8
						&& i<=(n-1)/2 ||i==0 && j>(n-1)/2 && j<5*(n-1)/8 ||
						i==(n-1)/8 && j<3*(n-1)/8 && j>(n-1)/4 || i==(n-1)/8 &&
						j<7*(n-1)/8 && j>3*(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
