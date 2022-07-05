import java.util.Scanner;

public class CalculateAvgOfNumbers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		int[] num=new int[100];
		float avg;
		float sum=0.0f;
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the numbers of data:");
		n= sc.nextInt();
		
		
		while(n>100||n<=0) {
			
			//Scanner sc=new Scanner(System.in);
			System.out.print("Error! number should be in range(1-100)");
			System.out.print("Enter number again");
			//Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
		}
		for( i=0;i<n;i++) {
			System.out.print(i+1+"-"+"Enter number:");
			//Scanner sc=new Scanner(System.in);
			num[i]=sc.nextInt();
			sum+=num[i];
	}
		avg=sum/n;
        System.out.print("Average of numbers "+avg);
}
}