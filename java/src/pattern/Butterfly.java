package pattern;

public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n = 7;
			for(int i=0; i<=n-1; i++) {
				for(int j=0; j<=n-1; j++) {
					if(i==j ) {
						System.out.print(" *");
					}else if(i+j==n-1){
						System.out.print(" *");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
	}

}
