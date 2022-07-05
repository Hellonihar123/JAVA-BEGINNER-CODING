import java.util.Scanner;

public class FindVowelConsonantsDigitsWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels=0,consonants=0,whitespaces=0,digits=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string:");
		String s=sc.next();
		int n=s.length();
		for(int i=0;i<n;++i) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i)== 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
		        ++vowels;
		      }
			else if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				++digits;
				
			}else if(s.charAt(i)==' ') {
				++whitespaces;
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				++consonants;
			}
		}
		 System.out.println("Vowels: " + vowels);
		    System.out.println("Consonants: " + consonants);
		    System.out.println("Digits: " + digits);
		    System.out.println("White spaces: " + whitespaces);

	}

}
