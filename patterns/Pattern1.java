package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==3||j==3||i==2&&j==2||i==2&&j==4||i==4&&j==2||i==4&&j==4) 
					System.out.print("* ");
					
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
				

	}

}
