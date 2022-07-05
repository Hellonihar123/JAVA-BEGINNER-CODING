import java.util.Scanner;

public class FibonacciSequenceUptoCertainNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter series upto ");
		int n,t1=0,t2=1,nextterm=0;
		n = sc.nextInt();
		while(t1<=n) {
			System.out.print(t1+" ,");
			nextterm=t1+t2;
			t1=t2;
			t2=nextterm;
			}

	}

}
