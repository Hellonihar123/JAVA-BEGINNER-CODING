import java.util.Scanner;

public class SumOfNnaturalsNumbers {
	public static int  sum(int num) {
		if(num !=0 ) {
			return num+ sum(num-1);
		}else
			return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc= new Scanner(System.in);
		int sum;
		System.out.print("Enter a number (N)to find sum of N naturals numbers:");
		int n= sc.nextInt();
		int add=sum(n);
		System.out.print("Sum of N natural numbers is: "+add);

	}

}
