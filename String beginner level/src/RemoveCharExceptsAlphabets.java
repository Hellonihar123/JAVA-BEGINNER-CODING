import java.util.Scanner;
// write a programme to remove all char in a string excepts alphabets
public class RemoveCharExceptsAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s,temp=" ";
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string:");
		s=sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z'||s.charAt(i)>='A' && s.charAt(i)<='Z') {
				temp=temp+s.charAt(i);
			}
		}
		System.out.print(temp);

	}

}
