import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter number you want to reverse:");
		int n=sc.nextInt();
		int rem,revno=0;
		while(n!=0) {
			rem=n%10;
			revno= revno*10+rem;
			n/=10;
		}
       System.out.print("Reverse of number is: "+ revno);
	}

}
