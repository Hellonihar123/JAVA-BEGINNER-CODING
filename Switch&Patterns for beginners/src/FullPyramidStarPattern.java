import java.util.Scanner;

public class FullPyramidStarPattern {
	
	public static void printPyramid(int n){
		int k=0;
		for(int i=1;i<=n;++i, k=0) {
			for(int j=1;j<=n-i;++j) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print("*");
				++k;
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
		printPyramid(c);

	}

}
