import java.util.Scanner;

public class SolidRectangularStar {
	public static void printStar(int n){
		
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter n:");
		c=sc.nextInt();
		//row=sc.nextInt();
		printStar(c);
		
		

	}

}
