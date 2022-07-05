import java.util.Scanner;

public class ConvertBinaryToDecimal {
	public static int convert(String  b,int i) {
		//if we reach last char
		int n= b.length();
		if(i==n-1) {
			return b.charAt(i)-'0';
		}
		//add current term and recurssion for remaining terms
		return ((b.charAt(i)-'0')<<(n-i-1))+ convert(b,i+1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter binary number:");
		String b=sc.next();
		int i=0;
		System.out.print("binary to decimal of number "+b+" is: "+convert(b,i));

	}

}
