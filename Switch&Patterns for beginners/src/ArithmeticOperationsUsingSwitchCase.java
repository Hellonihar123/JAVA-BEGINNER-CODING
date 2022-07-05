import java.util.Scanner;

public class ArithmeticOperationsUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter two operands:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		System.out.print("Enter operator: ");
		char c= sc.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println("Sum of two numbers is:"+(a+b));
			break;
		case '-':
			System.out.println("Subtraction of two numbers is:"+(a-b));
			break;
		case '*':
			System.out.println("Multiplication of two numbers is:"+(a*b));
			break;
		case '/':
			System.out.println("Division of two number is:"+(a/b));
			break;	
			
		}
	}

}
