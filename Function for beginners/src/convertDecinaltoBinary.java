import java.util.Scanner;

public class convertDecinaltoBinary {

		  public static void main(String[] args) {
			  Scanner sc= new Scanner(System.in);
			  int num=sc.nextInt();

		    // decimal number
		   // int num = 19;
		    System.out.println("Decimal to Binary");

		    // call method to convert to binary
		    long binary = convertDecimalToBinary(num);

		    System.out.println("\n" + num + " = " + binary);
		    }

		  public static long convertDecimalToBinary(int n) {

		    long binaryNumber = 0;
		    int remainder, i = 1, step = 1;

		    while (n!=0) {
		      remainder = n % 2;
		        System.out.println("Step " + step++ + ": " + n + "/2");

		        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
		        n /= 2;

		        binaryNumber += remainder * i;
		        i *= 10;
		    }
		    
		    return binaryNumber;
		    }
		}


