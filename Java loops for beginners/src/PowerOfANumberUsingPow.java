import java.util.Scanner;

public class PowerOfANumberUsingPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter base and exponent respectively:");
		double base,exponent, result;
		base= sc.nextFloat();
		exponent= sc.nextFloat();
		result= Math.pow(base,exponent);
		System.out.print("power of number is:"+ result);;
		

	}

}
