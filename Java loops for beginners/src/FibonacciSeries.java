import java.util.Scanner;

//Display fibonnacci upto Nth terms
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of termsS:");
		int n,t1=0,t2=1,nextterm=0;
		n = sc.nextInt();
		for(int i=1;i<=n;++i) {
			System.out.print(t1+" ,");
			nextterm=t1+t2;
			t1=t2;
			t2=nextterm;
			}
		
		

	}

}
