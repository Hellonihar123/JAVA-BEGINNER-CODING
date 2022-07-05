import java.util.Scanner;

public class PascalTriangle {
public static void printPascal(int n){
	
	for (int line =1; line<=n;line++) {
		for(int j=0;j<=n-line;j++) {
			//for left spacing
			System.out.print(" ");
		}
		//used to represent c(line,i)
		int c=1;
		for(int i=1;i<=line;i++) {
		//the first value in a line is always 1
			System.out.print(c +" ");
			c=c*(line-i)/i;
		}	
		System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();
		printPascal(n);
	}
	
}

