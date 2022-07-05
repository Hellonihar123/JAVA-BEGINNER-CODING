import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter elements in an array:");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		
		float sum=0.0f,mean,standarddeviation=0.0f;
		for(int i=0;i<10;i++) {
			sum+=arr[i];
		}
		mean=sum/10;
		for(int i=0;i<10;i++) {
			standarddeviation += Math.pow(arr[i]-mean, 2);
		}
		System.out.print(Math.sqrt(standarddeviation/10));

	}

}
