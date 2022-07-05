import java.util.Scanner;

public class InvertedFullPyramid {
	public static void printPyramid(int n) {
	int k=0,i,j;
	for( i=n;i>=1;--i) {
		for( j=0;j<n-i;++j) {
			System.out.print(" ");
		}
		for( j=i;j<=2*i-1;++j) {
			System.out.print("*");
		}
		for(j=0;j<i-1;++j) {
			System.out.print("*");
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
