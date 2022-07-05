import java.util.Scanner;

public class CalculatePower {
	public static int calculate(int b,int p) {
		if(p!=0) {
			return b* calculate(b*p-1);
		}else
			return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, power,result;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter base and power respectively:");
		base= sc.nextInt();
		power= sc.nextInt();
		result= calculate(base,power);
		System.out.print(base+" ^ "+ power+" is: "+result);
		
		

	}

}
