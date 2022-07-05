import java.util.Scanner;

public class CheckForPalindrome {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:");
		int rem,reverse=0,n,num;
		n=sc.nextInt();
		num=n;
		
		while(n!=0) {
			rem =n%10;
			reverse=(reverse*10)+rem;
			n/=10;
		}
		
			if(num==reverse) {
				System.out.print("The number is a palindrome.");
				
			}else {
				System.out.print("The number is not a palindrome.");
			}
		
	}

}
