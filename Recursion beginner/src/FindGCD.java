import java.util.Scanner;

public class FindGCD {
	public static int findgcd(int n1,int n2) {
		if (n2!=0)
			return findgcd(n2, n1 % n2);
		else
			return n1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter two number to find gcd:");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int gcd=findgcd(a,b);
		System.out.print("Gcd of two numbers is:"+gcd);

	}

}
