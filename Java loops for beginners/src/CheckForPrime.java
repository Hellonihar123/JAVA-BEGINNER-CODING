import java.util.Scanner;

public class CheckForPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		boolean flag= false;
		while(i<=n/2) {
		if(n%i==0) {
			flag=true;
			break;
		}
		++i;
		
		}
		if(!flag) {
			System.out.print(n+" is a prime number.");
		}else
			System.out.print(n+" is a prime number.");

	}

}
