import java.util.Scanner;

public class PrimeBetweenTwoIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter two numbers :");
		Scanner sc= new Scanner(System.in);
		int i,low,high;
		 low=sc.nextInt();
		 high= sc.nextInt();
		boolean isPrime= true;
		System.out.print("Prime numbers between "+low+" & "+high+" are: ");
		while(low<high) {
			isPrime=true;
			if(low==0||low==1) {
				isPrime=false;
			}
			else {
				for(i=2;i<=low/2;++i) {
					if(low%i==0) {
						isPrime=false;
						break;
					}
				}
			}
			if(isPrime)
				System.out.print(low+"  ");
			    ++low;
		}


	}

}
