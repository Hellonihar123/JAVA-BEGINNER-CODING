import java.util.Scanner;

public class DisplayFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		n= sc.nextInt();
		
		System.out.print("Factors of "+n+ " are:");
		for(i=1;i<=n;++i) {
			if(n%i==0)
				System.out.print(i +" ");
		}
		

	}

}
