import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a year: ");
		int a= sc.nextInt();
		if(a%4==0) {
			if(a%100==0) {
				if(a%400==0) {
					System.out.print("is a leap year");
				}else {
					System.out.print("is not a leap year");
				}
			}else
				System.out.print("is a leap year");
				
		}else
		System.out.print("is not  a leap year");

	}

}
