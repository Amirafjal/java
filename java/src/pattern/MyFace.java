package pattern;

public class MyFace {

	public static void main(String[] args) {
		int n=4;
		//i0
		for(int i=0; i<n; i++) {
			//0
//			for(int j=0; j<n; j++) {
//				if(true) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" $");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(i+j>=n+(n-1)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(i>=(n-1)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(i==(n-1)/4 && j>0 || i>=3*(n-1)/8 ) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(i>=(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(i==(n-1)/4 && j<n-1 || i>=3*(n-1)/8) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(i>=(n-1)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(2*i-j>=n) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
		//i1
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" $");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(i+j>=n-1+(n-3)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(i>=0) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(i>=j) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}//i2
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(i+j>=n-1+(n-3)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(i>=0) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(i>=0 && j<=n-1) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(i>=j) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}//i3
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(i-j<=(n-1)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(i>=0) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(true) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(i>=0 && j<=3*(n-1)/4 || j-i>=6-n) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}//4
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(i+j<=n-1) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(i>=0 && j>=(n-1)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}//i5
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(j<=(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(j>=7*(n-1)/8) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}//i6
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(j<=(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(i>=7*(n-1)/8 && i!=n-1) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(i>=3*(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(i>=3*(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(i>=7*(n-1)/8 && i!=n-1) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(j>=7*(n-1)/8) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}//i7
		for(int i=0; i<n; i++) {
//			//0
//			for(int j=0; j<n; j++) {
//				if(false) {
//					System.out.print("$");
//				}else {
//					System.out.print(" ");
//				}
//			}//1
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//2
			for(int j=0; j<n; j++) {
				if(j<=(n-1)/4) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//3
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//4
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//5
			for(int j=0; j<n; j++) {
				if(j-i>=(n-1)/2 && i!=3*(n-1)/8 || i==5*(n-1)/8 ) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//6
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//7
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//8
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//9
			for(int j=0; j<n; j++) {
				if(i+j<=(n-1)/2 && i!=(n-1)/2) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//10
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//11
			for(int j=0; j<n; j++) {
				if(false) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}//12
			for(int j=0; j<n; j++) {
				if(j>=7*(n-1)/8) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
