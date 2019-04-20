import java.util.Scanner;

public class FactorialNumber{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Factorial number : ");
		long number = input.nextLong();

		long fact = 1,i;

		for (i=1; i<=number; i++) {
			fact *= i;
		}
		System.out.println(number+ "! is = " +fact);
	}
}