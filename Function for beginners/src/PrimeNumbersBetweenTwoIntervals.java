import java.util.Scanner;
public class PrimeNumbersBetweenTwoIntervals{
	
public static boolean IsPrime(int my_input) {
    boolean flag = true;
    for (int i = 2; i <= my_input / 2; ++i) {
       if (my_input % i == 0) {
          flag = false;
          break;
       }
    }
    return flag;
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int my_high, my_low;
	      System.out.println("Required packages have been imported");
	      Scanner my_scanner = new Scanner(System.in);
	      System.out.println("A reader object has been defined ");
	      System.out.print("Enter the starting number : ");
	      my_low = my_scanner.nextInt();
	      System.out.print("Enter an ending Number: ");
	      my_high = my_scanner.nextInt();
	      System.out.println("The prime numbers between the interval " + my_low + " and " + my_high + " are:");
	      while (my_low < my_high) {
	         if (IsPrime(my_low))
	            System.out.print(my_low + " ");
	            ++my_low;
	      }
		
}
	}
