import java.util.Scanner;
public class InputOutput{
	public static void main(String[] args) {
		Scanner input  = new Scanner (System.in);
		//int input
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		//String 
		System.out.print("Enter a Name : ");
		String name = input.next();

		System.out.println("You are Entered : "+number);
		System.out.println("You are Entered : "+name);
	}
}