package collegeJavaPrograms;
import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = input.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
		}
		System.out.print("the Factorial of the "+n+" is : "+fact);
	}

}
