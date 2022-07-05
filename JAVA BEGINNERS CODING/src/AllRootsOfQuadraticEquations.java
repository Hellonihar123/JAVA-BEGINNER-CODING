import java.util.Scanner;

public class AllRootsOfQuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,x1,x2, discriminant, realpart,imaginarypart;
		System.out.print("Emter coffcient a,b,c");
		Scanner sc= new Scanner(System.in);
		a= sc.nextFloat();
		b= sc.nextFloat();
		c=sc.nextFloat();
		
		discriminant=b*b-4*a*c;
		if(discriminant>0) {
			x1=(-b+sqrt(discriminant)/(2*a));
			x2=(-b-sqrt(discriminant)/(2*a));
			System.out.println("Roots are real and different:"+" x1= "+x1+" x2= "+x2);
			
			
		}else if(discriminant==0){
			System.out.println("Roots are complex and different");
			x1=-b/(2*a);
			System.out.println("x1 =x2="+x1);
			
			//array, hashing,sorting,searching //linklist,stack, queue,string
		}else {
			realpart=-b/(2*a);
			imaginarypart=sqrt(-discriminant)/(2*a);
			System.out.println("roots are complex and different:");
			System.out.println("x1=" + realpart + "+" +imaginarypart + "i");
			System.out.println("x2="+ realpart + "-" + imaginarypart  + "i");
			
		}

	}

	private static float sqrt(float discriminant) {
		// TODO Auto-generated method stub
		return 0;
	}

}
