import java.util.Scanner;

public class FactorialOfANumber {
	
	public static int  fact(int num) {
		if(num >=2) {
			return num* fact(num-1);
		}else
			return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int sum;
		System.out.print("Enter a number to find factorial:");
		int n= sc.nextInt();
		int factorial=fact(n);
		System.out.print("Factorial is: "+factorial);


	}

}
