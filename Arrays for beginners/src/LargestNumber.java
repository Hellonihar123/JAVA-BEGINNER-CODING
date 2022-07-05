import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int[] arr= new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter elements in an array:");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			max=Math.max(arr[i], max);
			
			
		}
		System.out.print("Maximun number in an array is:"+ max);
		
	}

}
