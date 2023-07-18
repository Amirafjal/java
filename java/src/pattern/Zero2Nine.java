package pattern;

public class Zero2Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==(n-1)/4 || i==n-1 && j>0 && j<(n-1)/2 ||
						i+j==(n-1)/4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(i==0 && j>1 && j<n/2 || i==n-1 && j>0 && j<=3*(n-1)/4 ||
						i+j==n-1 && i>=3*(n-1)/5 ||
						j==3*(n-2)/4 && i>0 && i<(n-1)/2 || i+j==(n-1)/6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(i==0 && j<=(n-1)/2 || i+j==(n-1)/2 || i==(n-1)/2 && j<(n-1)/2
						|| j==(n-1)/2 && i>(n-1)/2 && i<n-1 || i==n-1 && j<(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(j==(n-1)/2 || i==(n-1)/2 && j>=(n-1)/4 && j<=3*(n-1)/4
						|| i+j==(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(i==0 && j<=(n-1)/2 || j==0 && i<=(n-1)/2 ||
						i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1
						|| i==n-1 && j<(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<(n-1)/2 ||
						i==(n-1)/2 && j<(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1
						|| i==n-1 && j>0 && j<(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(i+j==n-1 || i==0 && j<=3*(n-1)/2 || i==(n-1)/2 && j>1 && j<3*(n-(n-1)/2)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0; j<n; j++) {
				if(i==0 && j<(n-1)/2 && j>0 || i==(n-1)/2 && j>0 && j<(n-1)/2 ||
						i==n-1 && j>0 && j<(n-1)/2 || j==0 && i>0 && i!=(n-1)/2 && i<n-1
						|| j==(n-1)/2 && i>0 && i!=(n-1)/2 && i<n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(i==0 && j>0 & j<(n-1)/2 ||i==(n-1)/2 && j>0 && j<(n-1)/2
						|| i==n-1 && j>0 && j<(n-1)/2 || 
						j==0 && i>0 && i<(n-1)/2 || j==(n-1)/2 && i>0 && i<n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int j=0; j<n; j++) {
				if(j==0 && i>0 && i <n-1 || j==(n-1)/2 && i>0 && i<n-1 ||
						i==0 && j>0 && j<(n-1)/2 || i == n-1 && j>0 && j<(n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
