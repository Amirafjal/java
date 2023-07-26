package pattern;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=1; i<n; i++) {	
			//Number changing pyramid
//			for(int j=1; j<=i; j++) {
//				if(i==1) {
//					System.out.print(j+" ");
//				}else if(i==2){
//					System.out.print(j+n-4+"  ");
//				}else if(i==3){
//					System.out.print(j+n-2+"  ");
//				}else {
//					System.out.print(j+n+1+"  ");
//				}
//			}
			
//			<--  Zero one triangle    -->
			for(int j=1; j<=i; j++) {
				if(i==1) {
					System.out.print(j+" ");
				}else if(i==2){
					System.out.print(j-1+" ");
				} else if(i==3){
					if(j==1) {
						System.out.print(j+" ");
					}else if(j==2) {
						System.out.print(j-2+" ");
					}else if(j==3){
						System.out.print(j-2+" ");
					}
				}else if(i==4){
					if(j==1) {
						System.out.print(j-1+" ");
					}else if(j==2) {
						System.out.print(j-1+" ");
					}else if(j==3) {
						System.out.print(j-3+" ");
					}else {
						System.out.print(j-3+" ");
					}
				}
			}
			
			System.out.println();
		}
	}

}
