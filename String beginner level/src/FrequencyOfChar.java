import java.util.Scanner;

public class FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string:");
		String s=sc.next();
		System.out.print("Enter char to find frequency:");
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				++count;
			}
			
		}
		System.out.print("Frequency of char "+ch+" in string "+s+" is: "+count);

	}
}