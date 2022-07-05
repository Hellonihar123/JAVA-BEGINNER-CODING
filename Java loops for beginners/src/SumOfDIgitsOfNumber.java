import java.util.Scanner;

public class SumOfDIgitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter number you want to sum the digits:");
		int n=sc.nextInt();
		int rem,sum=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			//revno= revno*10+rem;
			n/=10;
			
		}
       System.out.print("Sum of digits is: "+ sum);
	

	}

}
