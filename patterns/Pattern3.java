package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int row=4,col=7;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==4||j==4||i==3&&j==2||i==3&&j==5||i==3&&j==6||i==3&&j==3||i==3&&j==6||i==2&&j==3||i==2&&j==5)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			 
		}

	}

}
