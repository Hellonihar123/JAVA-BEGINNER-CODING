import java.util.Scanner;

public class HollowRectangularStar {
	
	public static void printPyramid(int n, int m) {
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=m;j++) {
				if(i==1||i==n||j==1||j==m)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		Scanner sc= new Scanner(System.in);
		row=sc.nextInt();
		col=sc.nextInt();
		 printPyramid(row,col);
		

	}

}
