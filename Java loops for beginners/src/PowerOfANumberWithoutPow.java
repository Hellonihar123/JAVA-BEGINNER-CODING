import java.util.Scanner;

public class PowerOfANumberWithoutPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter base and exponent respectively:");
		double base,exponent, result;
		base= sc.nextFloat();
		exponent= sc.nextFloat();
		result=1;
		
        while(exponent!=0) {
        	result=result *base;
        	--exponent;
        }
        System.out.print("power of number "+base+"and exponent "+ exponent+ " is "+result);
	}

}
