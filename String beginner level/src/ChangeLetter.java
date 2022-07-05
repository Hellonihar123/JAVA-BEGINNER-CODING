import java.util.Scanner;

public class ChangeLetter {
	
	//WAP to change every letter in a given string with the letter following i in the alphabets(i.e a becomes b,p becomes q,z becomes a)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string:");
		String s=sc.next();
		
		String rc =s.replace('a','b');
		 rc =rc.replace('p','q');
		 rc =rc.replace('z','a');
		System.out.print(rc);
		
		
		
		}

	}


