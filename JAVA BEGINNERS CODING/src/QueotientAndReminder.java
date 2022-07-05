import java.util.Scanner;

public class QueotientAndReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter divident and divisor:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int quotient= a/b;
		int remainder=a%b;
		System.out.println("quotient="+quotient+"  "+"remainder="+remainder);
		

	}

}
