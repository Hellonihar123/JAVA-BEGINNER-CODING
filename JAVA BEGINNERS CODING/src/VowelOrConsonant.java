import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter char");
		ch= sc.next().charAt(0);
		if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
			System.out.print(ch+" is vowel");
		}else {
			System.out.print(ch+" is consonant");
		}

	}

}
