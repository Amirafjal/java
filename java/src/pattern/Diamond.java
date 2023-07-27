package pattern;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		for(int i = 0 ; i<=n-1 ; i++) {
			for(int j=0; j<=n-1; j++) {
				if (i+j==(n-1)/2) {
					System.out.print("*");
				}else if(j-i==(n-1)/2){
					System.out.print("*");
				}else if(i-j==(n-1)/2){
					System.out.print("*");
				}else if(i-j==(n-1)/2){
					System.out.print("*");
				}else if(i+j==n-1+(n-1)/2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.print(" ");
			for(int j=0; j<=n-1; j++) {
				if (i+j<=(n-1)/2) {
					System.out.print("*");
				}else if(j-i>=(n-1)/2){
					System.out.print("*");
				}else if(i-j>=(n-1)/2){
					System.out.print("*");
				}else if(i-j==(n-1)/2){
					System.out.print("*");
				}else if(i+j>=n-1+(n-1)/2){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.print(" ");
			for(int j=0; j<=n-1; j++) {
				if (i==j) {
					System.out.print("*");
				}else if(i+j==n-1){
					System.out.print("*");
				}else if(i==0){
					System.out.print("*");
				}else if(i==n-1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.print(" ");
			for(int j=0; j<=n-1; j++) {
				if (i==0 && j<(n-1)/2 || i==1 && j!=0 && j<=(n-1)/2 || i==2 && j>2 
						&& j<n-2 || i==3 && j>3 && j<(n-1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
