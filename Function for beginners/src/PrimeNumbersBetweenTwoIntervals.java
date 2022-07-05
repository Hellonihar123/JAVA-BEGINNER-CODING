import java.util.Scanner;

public class PrimeNumbersBetweenTwoIntervals {
	public static boolean checkprime(int n) {
		boolean isPrime=true;
		//0 and 1 are not prime numbers
		if(n==0|| n==1) {
			isPrime=false;
		}else {
			for (int j=2;j<=n/2;++j) {
				if(n%j==0) {
					isPrime=false;
					break;
				}
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two number to find prime numbers between them:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean flag;
		//swapping two numbers if a>b
		if(a>b) {
			b=a+b;
			a=b-a;
			b=b-a;
		}
		System.out.print("prime numbers between "+a +" & "+b +" are:");
		for(int i=a+1;i<b;++i)
			flag= checkprime(i);
		if(flag)
			System.out.print(i+" ");
		
		
		
	}

}
