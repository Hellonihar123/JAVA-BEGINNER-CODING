import java.util.Scanner;

public class SumofNnaturalsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number:");
		int n= sc.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++) {
			 sum=sum+i;
		}
		System.out.println("sum of N naturals numbers is: "+ sum );
	}

}
